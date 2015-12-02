.class Lcom/qihoo/security/ui/main/BoosterFragment$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 1205
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 6

    .prologue
    const/high16 v5, 0x7f0f0000

    const/4 v1, 0x0

    .line 1209
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1210
    if-nez v0, :cond_1

    .line 1211
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1212
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1220
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->v(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    invoke-virtual {v2, v5, v3}, Lcom/qihoo/security/locale/d;->a(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1222
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->w(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    invoke-virtual {v2, v5, v3}, Lcom/qihoo/security/locale/d;->a(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1224
    return-void

    .line 1213
    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v2

    if-lt v1, v2, :cond_2

    .line 1214
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    int-to-float v2, v0

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v1, v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1215
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    goto/16 :goto_0

    .line 1216
    :cond_2
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 1217
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    int-to-float v2, v0

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->t(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->u(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v1, v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1218
    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    goto/16 :goto_0
.end method
