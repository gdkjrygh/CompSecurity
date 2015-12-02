.class public Lcom/qihoo/security/dialog/j;
.super Landroid/app/Dialog;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/d;


# instance fields
.field private a:Lcom/qihoo/security/dialog/DialogButtons;

.field private b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private d:Landroid/widget/ImageView;

.field private final e:Lcom/qihoo/security/locale/d;

.field private f:Landroid/widget/ListView;

.field private g:Landroid/widget/BaseAdapter;

.field private h:Landroid/content/Context;

.field private i:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    const v0, 0x7f0d00f5

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 29
    iput-object v1, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    .line 30
    iput-object v1, p0, Lcom/qihoo/security/dialog/j;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 31
    iput-object v1, p0, Lcom/qihoo/security/dialog/j;->d:Landroid/widget/ImageView;

    .line 32
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->e:Lcom/qihoo/security/locale/d;

    .line 33
    iput-object v1, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/dialog/j;->h:Landroid/content/Context;

    .line 40
    iput-object p1, p0, Lcom/qihoo/security/dialog/j;->h:Landroid/content/Context;

    .line 41
    const v0, 0x7f030070

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->setContentView(I)V

    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/dialog/j;->a()V

    .line 43
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 58
    const v0, 0x7f0b017d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->i:Landroid/view/View;

    .line 59
    const v0, 0x7f0b0100

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/DialogButtons;

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    .line 60
    const v0, 0x7f0b00fd

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 61
    const v0, 0x7f0b00fe

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 62
    const v0, 0x7f0b00fc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->d:Landroid/widget/ImageView;

    .line 63
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/j;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/dialog/j;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 68
    iget-object v1, p0, Lcom/qihoo/security/dialog/j;->i:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    return-void
.end method


# virtual methods
.method protected a([Ljava/lang/String;)Landroid/widget/BaseAdapter;
    .locals 3

    .prologue
    .line 176
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/qihoo/security/dialog/j;->h:Landroid/content/Context;

    const v2, 0x7f030091

    invoke-direct {v0, v1, v2, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    return-object v0
.end method

.method public a([Ljava/lang/String;ILandroid/widget/AdapterView$OnItemClickListener;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 151
    invoke-virtual {p0, p1}, Lcom/qihoo/security/dialog/j;->a([Ljava/lang/String;)Landroid/widget/BaseAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->g:Landroid/widget/BaseAdapter;

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/dialog/j;->g:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 154
    if-eqz p3, :cond_0

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    invoke-virtual {v0, p3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 158
    :cond_0
    if-ltz p2, :cond_1

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    invoke-virtual {v0, p2, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 162
    :cond_1
    return-void
.end method

.method public a([Ljava/lang/String;Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 4

    .prologue
    .line 133
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 141
    :goto_0
    return-void

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 137
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/qihoo/security/dialog/j;->h:Landroid/content/Context;

    const v2, 0x7f0300a2

    const v3, 0x7f0b0219

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/j;->g:Landroid/widget/BaseAdapter;

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/dialog/j;->g:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->f:Landroid/widget/ListView;

    invoke-virtual {v0, p2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DialogButtons;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 79
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonText([I)V

    .line 74
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->a:Lcom/qihoo/security/dialog/DialogButtons;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonText([Ljava/lang/CharSequence;)V

    .line 84
    return-void
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->e:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 114
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 103
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 109
    :goto_0
    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->e:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/j;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 99
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 88
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 94
    :goto_0
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/dialog/j;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method
