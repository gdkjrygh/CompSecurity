.class public Lcom/facebook/contacts/e/b;
.super Ljava/lang/Object;
.source "DbContactIterator.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/facebook/contacts/models/Contact;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/contacts/data/a;

.field private c:Landroid/database/Cursor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/contacts/e/a;

    sput-object v0, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/data/a;Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/contacts/e/b;->b:Lcom/facebook/contacts/data/a;

    .line 31
    iput-object p2, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/models/Contact;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 36
    iget-object v1, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    if-nez v1, :cond_0

    .line 37
    sget-object v1, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    const-string v2, "next: not initialized, skipping"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 55
    :goto_0
    return-object v0

    .line 41
    :cond_0
    iget-object v1, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 42
    sget-object v1, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    const-string v2, "next: cursor empty"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/facebook/contacts/e/b;->b:Lcom/facebook/contacts/data/a;

    iget-object v2, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/data/a;->b(Ljava/lang/String;)Lcom/facebook/contacts/models/Contact;

    move-result-object v1

    .line 49
    sget-object v2, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "next: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v1

    .line 52
    sget-object v2, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "next: error deserializing contact: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public close()V
    .locals 2

    .prologue
    .line 70
    sget-object v0, Lcom/facebook/contacts/e/b;->a:Ljava/lang/Class;

    const-string v1, "closing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    .line 75
    :cond_0
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/e/b;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/facebook/contacts/e/b;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 65
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "DbContactIterator does not support remove()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
