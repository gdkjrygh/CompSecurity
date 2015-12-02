.class public Lcom/qihoo/security/floatview/ui/a;
.super Lcom/qihoo/security/floatview/ui/c;
.source "360Security"


# static fields
.field private static final t:Ljava/lang/String;


# instance fields
.field a:Lcom/qihoo/security/floatview/ui/b;

.field private u:Lcom/qihoo/security/floatview/ui/i;

.field private v:I

.field private w:Z

.field private x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/floatview/ui/a;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/qihoo/security/floatview/ui/c$a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 47
    invoke-direct/range {p0 .. p7}, Lcom/qihoo/security/floatview/ui/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/qihoo/security/floatview/ui/c$a;)V

    .line 13
    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    .line 14
    iput v0, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    .line 15
    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->w:Z

    .line 16
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->x:Z

    .line 17
    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/a;->a:Lcom/qihoo/security/floatview/ui/b;

    .line 48
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/a;->m()V

    .line 49
    return-void
.end method

.method private m()V
    .locals 2

    .prologue
    .line 52
    new-instance v0, Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/floatview/ui/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/a;->addView(Landroid/view/View;)V

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/a;->n()V

    .line 55
    return-void
.end method

.method private n()V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->g()V

    .line 59
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getSide()I

    move-result v0

    .line 60
    packed-switch v0, :pswitch_data_0

    .line 72
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->d()V

    goto :goto_0

    .line 67
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->f()V

    goto :goto_0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->a()V

    .line 31
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1}, Lcom/qihoo/security/floatview/ui/c;->a(I)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->w:Z

    if-eqz v0, :cond_1

    .line 96
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/a;->n()V

    goto :goto_0
.end method

.method protected a(II)V
    .locals 1

    .prologue
    .line 191
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/floatview/ui/c;->a(II)V

    .line 192
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getActionListener()Lcom/qihoo/security/floatview/ui/b;

    move-result-object v0

    .line 193
    if-eqz v0, :cond_0

    .line 194
    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/floatview/ui/b;->a(II)V

    .line 196
    :cond_0
    return-void
.end method

.method protected a(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .prologue
    .line 109
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    :goto_0
    return-void

    .line 112
    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->w:Z

    if-eq v0, p1, :cond_0

    .line 76
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/ui/a;->w:Z

    .line 77
    if-eqz p1, :cond_1

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->e()V

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 80
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/a;->n()V

    goto :goto_0
.end method

.method protected a(IIZ)Z
    .locals 2

    .prologue
    .line 200
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/floatview/ui/c;->a(IIZ)Z

    move-result v0

    .line 201
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getActionListener()Lcom/qihoo/security/floatview/ui/b;

    move-result-object v1

    .line 202
    if-eqz v1, :cond_0

    .line 203
    invoke-interface {v1, p1, p2, p3}, Lcom/qihoo/security/floatview/ui/b;->a(IIZ)Z

    move-result v0

    .line 205
    :cond_0
    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->b()V

    .line 37
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_2

    .line 122
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    if-eq v0, p1, :cond_2

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/ui/i;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    div-int/lit8 v0, v0, 0xa

    div-int/lit8 v1, p1, 0xa

    if-eq v0, v1, :cond_1

    .line 131
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->k()V

    .line 134
    :cond_1
    iput p1, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    .line 137
    :cond_2
    return-void

    .line 126
    :catch_0
    move-exception v0

    goto :goto_0

    .line 125
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public b(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/a;->q:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/a;->r:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v1, p0, Lcom/qihoo/security/floatview/ui/a;->i:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_1

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/a;->i:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getWidthOnSide()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 234
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/a;->setSide(I)V

    .line 239
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->g:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    :cond_0
    return-void

    .line 236
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->h:Landroid/view/WindowManager$LayoutParams;

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 237
    invoke-virtual {p0, v2}, Lcom/qihoo/security/floatview/ui/a;->setSide(I)V

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->c()V

    .line 43
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 118
    :goto_0
    return v0

    .line 117
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 141
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getActionListener()Lcom/qihoo/security/floatview/ui/b;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    .line 143
    invoke-interface {v0}, Lcom/qihoo/security/floatview/ui/b;->a()V

    .line 145
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 149
    invoke-virtual {p0, v2}, Lcom/qihoo/security/floatview/ui/a;->a(Z)V

    .line 150
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getActionListener()Lcom/qihoo/security/floatview/ui/b;

    move-result-object v0

    .line 151
    if-eqz v0, :cond_0

    .line 152
    invoke-interface {v0}, Lcom/qihoo/security/floatview/ui/b;->b()V

    .line 154
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/floatview/ui/c;->f()Z

    move-result v0

    .line 159
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/i;->g()V

    .line 160
    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/qihoo/security/floatview/ui/a;->w:Z

    if-nez v1, :cond_1

    .line 161
    iget-boolean v1, p0, Lcom/qihoo/security/floatview/ui/a;->x:Z

    if-eqz v1, :cond_3

    .line 162
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->a()V

    .line 167
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 168
    iput-boolean v2, p0, Lcom/qihoo/security/floatview/ui/a;->x:Z

    .line 170
    :cond_2
    return v0

    .line 164
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->c()V

    goto :goto_0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/a;->getActionListener()Lcom/qihoo/security/floatview/ui/b;

    move-result-object v0

    .line 179
    if-eqz v0, :cond_0

    .line 180
    invoke-interface {v0}, Lcom/qihoo/security/floatview/ui/b;->c()V

    .line 182
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/floatview/ui/c;->g()V

    .line 183
    return-void
.end method

.method public getActionListener()Lcom/qihoo/security/floatview/ui/b;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->a:Lcom/qihoo/security/floatview/ui/b;

    return-object v0
.end method

.method public getCurX()I
    .locals 1

    .prologue
    .line 217
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->k:I

    return v0
.end method

.method public getCurY()I
    .locals 1

    .prologue
    .line 221
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->m:I

    return v0
.end method

.method public getDownX()I
    .locals 1

    .prologue
    .line 209
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->o:I

    return v0
.end method

.method public getDownY()I
    .locals 1

    .prologue
    .line 213
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->p:I

    return v0
.end method

.method public getMemoryUsageView()Lcom/qihoo/security/floatview/ui/i;
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    return-object v0
.end method

.method public getPercent()I
    .locals 1

    .prologue
    .line 186
    iget v0, p0, Lcom/qihoo/security/floatview/ui/a;->v:I

    return v0
.end method

.method public getWidthOnSide()I
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/a;->u:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/i;->getWidthOnSide()I

    move-result v0

    .line 103
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v0

    goto :goto_0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 226
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->s:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 249
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/a;->x:Z

    return v0
.end method

.method public setActionListener(Lcom/qihoo/security/floatview/ui/b;)V
    .locals 0

    .prologue
    .line 20
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/a;->a:Lcom/qihoo/security/floatview/ui/b;

    .line 21
    return-void
.end method
