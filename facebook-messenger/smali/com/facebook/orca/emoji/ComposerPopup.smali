.class public abstract Lcom/facebook/orca/emoji/ComposerPopup;
.super Landroid/support/v4/app/DialogFragment;
.source "ComposerPopup.java"


# instance fields
.field protected Z:I

.field protected aa:I

.field protected ab:I

.field protected ac:I

.field protected ad:Z

.field protected ae:I

.field protected af:I

.field protected ag:Landroid/view/View;

.field protected ah:Lcom/facebook/analytics/av;

.field private ai:Lcom/facebook/orca/emoji/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 34
    return-void
.end method

.method private U()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 162
    const-string v0, "setupDialogWindow"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 163
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->c()Landroid/app/Dialog;

    move-result-object v1

    .line 164
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 165
    invoke-virtual {v2, v5}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 166
    const/high16 v3, 0x20000

    invoke-virtual {v2, v3}, Landroid/view/Window;->addFlags(I)V

    .line 168
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    .line 169
    iget v4, p0, Lcom/facebook/orca/emoji/ComposerPopup;->Z:I

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 170
    iget v4, p0, Lcom/facebook/orca/emoji/ComposerPopup;->aa:I

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 171
    const v4, 0x7fffffff

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 172
    iget v4, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ae:I

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 173
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 175
    invoke-virtual {v1, v5}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 176
    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Landroid/view/Window;->addFlags(I)V

    .line 177
    const/high16 v1, 0x40000

    invoke-virtual {v2, v1}, Landroid/view/Window;->addFlags(I)V

    .line 178
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 179
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/ComposerPopup;)Lcom/facebook/orca/emoji/b;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ai:Lcom/facebook/orca/emoji/b;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 2

    .prologue
    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->message_composer_popup_nub_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected O()V
    .locals 4

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->composer_popup_content_container:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/emoji/ComposerPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 140
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 142
    iget v2, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ac:I

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 143
    iget v2, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ab:I

    iget v3, p0, Lcom/facebook/orca/emoji/ComposerPopup;->af:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 144
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    return-void
.end method

.method protected P()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 148
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ad:Z

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->composer_popup_arrow_above:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ag:Landroid/view/View;

    sget v1, Lcom/facebook/i;->composer_popup_arrow_below:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method protected Q()V
    .locals 1

    .prologue
    .line 156
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 157
    invoke-direct {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->U()V

    .line 159
    :cond_0
    return-void
.end method

.method public R()Z
    .locals 1

    .prologue
    .line 190
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ad:Z

    return v0
.end method

.method protected abstract S()Ljava/lang/String;
.end method

.method protected T()Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 204
    return-object v0
.end method

.method protected a(Landroid/view/View;I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(",
            "Landroid/view/View;",
            "I)TT;"
        }
    .end annotation

    .prologue
    .line 182
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->a(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->Z:I

    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "y"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->aa:I

    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "gravity"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ae:I

    .line 62
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "height"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ab:I

    .line 63
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "width"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ac:I

    .line 64
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "showArrowAbove"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ad:Z

    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 67
    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ah:Lcom/facebook/analytics/av;

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/emoji/ComposerPopup;->b(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->af:I

    .line 70
    return-void
.end method

.method protected a(Lcom/facebook/orca/emoji/b;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ai:Lcom/facebook/orca/emoji/b;

    .line 74
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 196
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->T()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 197
    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ah:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 199
    return-void
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 83
    new-instance v0, Lcom/facebook/orca/emoji/a;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/ComposerPopup;->d()I

    move-result v2

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/orca/emoji/a;-><init>(Lcom/facebook/orca/emoji/ComposerPopup;Landroid/content/Context;I)V

    .line 127
    return-object v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 132
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ai:Lcom/facebook/orca/emoji/b;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/emoji/ComposerPopup;->ai:Lcom/facebook/orca/emoji/b;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/b;->a()V

    .line 136
    :cond_0
    return-void
.end method
