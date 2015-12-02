.class public Lcom/facebook/inject/ap;
.super Ljava/lang/Object;
.source "ProvisioningDebugStackProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/inject/ap;->a:Lcom/google/inject/a;

    .line 23
    iput-object p2, p0, Lcom/facebook/inject/ap;->b:Ljavax/inject/a;

    .line 24
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0xa

    .line 28
    sget-object v0, Lcom/facebook/inject/ao;->INSTANCE_GET:Lcom/facebook/inject/ao;

    iget-object v1, p0, Lcom/facebook/inject/ap;->a:Lcom/google/inject/a;

    invoke-static {v0, v1}, Lcom/facebook/inject/al;->a(Lcom/facebook/inject/ao;Lcom/google/inject/a;)V

    .line 29
    const/4 v0, 0x0

    .line 30
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Provider.get "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/inject/ap;->a:Lcom/google/inject/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    move-object v1, v0

    .line 34
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/inject/ap;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    invoke-virtual {v1, v2, v3}, Lcom/facebook/debug/d/e;->a(J)J

    .line 39
    :cond_0
    invoke-static {}, Lcom/facebook/inject/al;->a()V

    return-object v0

    .line 36
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {v1, v2, v3}, Lcom/facebook/debug/d/e;->a(J)J

    .line 39
    :cond_1
    invoke-static {}, Lcom/facebook/inject/al;->a()V

    throw v0

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method
