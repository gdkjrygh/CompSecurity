.class Lcom/qihoo/security/floatview/ui/f$8$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f$8;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/f$8;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/f$8;)V
    .locals 0

    .prologue
    .line 724
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 727
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/f;->e(Lcom/qihoo/security/floatview/ui/f;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 728
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/f;->f(Lcom/qihoo/security/floatview/ui/f;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 729
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/f;->e(Lcom/qihoo/security/floatview/ui/f;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "\n"

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->a(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)Ljava/lang/String;

    .line 730
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/f;->e(Lcom/qihoo/security/floatview/ui/f;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->b(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)V

    .line 737
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8$1;->a:Lcom/qihoo/security/floatview/ui/f$8;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->a(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)Ljava/lang/String;

    .line 739
    :cond_1
    return-void
.end method
