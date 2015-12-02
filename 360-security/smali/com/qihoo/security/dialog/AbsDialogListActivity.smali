.class public abstract Lcom/qihoo/security/dialog/AbsDialogListActivity;
.super Lcom/qihoo/security/app/BaseSimpleActivity;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/d;


# instance fields
.field protected final a:Lcom/qihoo/security/locale/d;

.field protected b:Landroid/content/Context;

.field private c:Lcom/qihoo/security/dialog/DialogButtons;

.field private d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ListView;

.field private h:Landroid/widget/BaseAdapter;

.field private i:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;-><init>()V

    .line 30
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->a:Lcom/qihoo/security/locale/d;

    .line 31
    iput-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b:Landroid/content/Context;

    .line 33
    iput-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    .line 34
    iput-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    .line 37
    iput-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 54
    const v0, 0x7f0b017d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->i:Landroid/view/View;

    .line 55
    const v0, 0x7f0b0100

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/DialogButtons;

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    .line 56
    const v0, 0x7f0b00fd

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 57
    const v0, 0x7f0b00fe

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 58
    const v0, 0x7f0b00fc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    .line 59
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b:Landroid/content/Context;

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 64
    iget-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 50
    const v0, 0x7f030070

    return v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 115
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 119
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    :goto_0
    return-void

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(Landroid/widget/BaseAdapter;Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 2

    .prologue
    .line 165
    iput-object p1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->h:Landroid/widget/BaseAdapter;

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->h:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    invoke-virtual {v0, p2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->h:Landroid/widget/BaseAdapter;

    if-nez v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 175
    :goto_0
    return-void

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->g:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    goto :goto_0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DialogButtons;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b:Landroid/content/Context;

    .line 45
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->setContentView(I)V

    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->b()V

    .line 47
    return-void
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 75
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonText([I)V

    .line 70
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->c:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonText([Ljava/lang/CharSequence;)V

    .line 80
    return-void
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 110
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 99
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 105
    :goto_0
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 95
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 84
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 90
    :goto_0
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogListActivity;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method
