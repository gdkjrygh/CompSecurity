.class Lcom/qihoo/security/enginehelper/clean/a$4;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 636
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$4;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 640
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$4;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->r(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/clearengine/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$4;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v1}, Lcom/qihoo/security/enginehelper/clean/a;->q(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/clearengine/surface/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/surface/a;)V

    .line 641
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$4;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->r(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/clearengine/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/a;->g()V

    .line 642
    return-void
.end method
