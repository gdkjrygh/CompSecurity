.class Lcom/qihoo/security/opti/trashclear/filemanager/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 71
    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 75
    sget-boolean v1, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Lcom/qihoo/security/opti/trashclear/filemanager/f;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    :goto_0
    return-void

    .line 79
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-static {v1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Lcom/qihoo/security/opti/trashclear/filemanager/a;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c()V

    goto :goto_0
.end method
