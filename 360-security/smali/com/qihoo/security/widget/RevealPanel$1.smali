.class Lcom/qihoo/security/widget/RevealPanel$1;
.super Lcom/qihoo/security/widget/RevealRippleLayout$b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/RevealPanel;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/RevealPanel;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/RevealPanel;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/RevealPanel;Z)Z

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->b(Lcom/qihoo/security/widget/RevealPanel;Z)Z

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->d(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth2:Lcom/qihoo/security/widget/shadow/ZDepth;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a()V

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(ZF)V

    .line 141
    return-void
.end method

.method public a(IZ)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x1

    .line 145
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->e(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 149
    if-eqz p2, :cond_3

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->f(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    if-le p1, v1, :cond_3

    .line 150
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->f(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    sub-int v1, p1, v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->f(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x64

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 151
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 152
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a(ZF)V

    .line 154
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(ZF)V

    .line 163
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->h(Lcom/qihoo/security/widget/RevealPanel;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a(IZ)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/RevealPanel;Z)Z

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->h(Lcom/qihoo/security/widget/RevealPanel;)Z

    move-result v0

    .line 167
    :cond_2
    return v0

    .line 155
    :cond_3
    if-nez p2, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->g(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    if-le p1, v1, :cond_1

    .line 156
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->f(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    sub-int v1, p1, v1

    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->f(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x64

    div-int/2addr v1, v2

    int-to-float v1, v1

    .line 157
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 158
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v2}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v2

    invoke-interface {v2, v3, v1}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->a(ZF)V

    .line 160
    :cond_4
    iget-object v2, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(ZF)V

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/RevealPanel;Z)Z

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    sget-object v1, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth2:Lcom/qihoo/security/widget/shadow/ZDepth;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/MaterialRippleLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->a(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/MaterialRippleLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->b(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setBackgroundColor(I)V

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->c()V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0}, Lcom/qihoo/security/widget/RevealPanel;->c(Lcom/qihoo/security/widget/RevealPanel;)Lcom/qihoo/security/widget/RevealRippleLayout$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/widget/RevealRippleLayout$a;->b()V

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->b(Lcom/qihoo/security/widget/RevealPanel;Z)Z

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$1;->a:Lcom/qihoo/security/widget/RevealPanel;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/widget/RevealPanel;->a(ZF)V

    .line 129
    return-void
.end method
