.class public Lcom/qihoo/security/dialog/DialogButtons;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/e;


# instance fields
.field a:Lcom/qihoo/security/locale/d;

.field b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

.field c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

.field d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

.field e:Landroid/view/View;

.field f:Landroid/view/View;

.field private g:[Ljava/lang/CharSequence;

.field private h:[Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->a:Lcom/qihoo/security/locale/d;

    .line 18
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    .line 19
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->h:[Landroid/view/View$OnClickListener;

    .line 23
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/DialogButtons;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030047

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/dialog/DialogButtons;->a()V

    .line 25
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 28
    const v0, 0x7f0b0102

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/material/MaterialRippleButton;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    .line 29
    const v0, 0x7f0b0103

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/material/MaterialRippleButton;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    .line 30
    const v0, 0x7f0b0105

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/material/MaterialRippleButton;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    .line 31
    const v0, 0x7f0b0104

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->f:Landroid/view/View;

    .line 32
    const v0, 0x7f0b0101

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->e:Landroid/view/View;

    .line 33
    return-void
.end method


# virtual methods
.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 123
    const/4 v0, 0x0

    .line 124
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    array-length v1, v1

    if-lez v1, :cond_0

    .line 125
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    array-length v1, v1

    if-ne v1, v2, :cond_1

    .line 126
    new-array v0, v2, [Lcom/qihoo/security/widget/material/MaterialRippleButton;

    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aput-object v1, v0, v3

    .line 133
    :cond_0
    :goto_0
    return-object v0

    .line 128
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    array-length v1, v1

    if-lt v1, v4, :cond_0

    .line 129
    new-array v0, v4, [Lcom/qihoo/security/widget/material/MaterialRippleButton;

    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aput-object v1, v0, v2

    goto :goto_0
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 46
    iput-object p1, p0, Lcom/qihoo/security/dialog/DialogButtons;->h:[Landroid/view/View$OnClickListener;

    .line 47
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    if-nez v1, :cond_1

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 50
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 51
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 52
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 53
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 54
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 55
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 56
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->h:[Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_0

    .line 60
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    array-length v1, v1

    if-ne v1, v3, :cond_3

    .line 62
    if-eqz p1, :cond_2

    :try_start_0
    array-length v1, p1

    if-lez v1, :cond_2

    .line 63
    const/4 v1, 0x0

    aget-object v0, p1, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2

    .line 68
    :cond_2
    :goto_1
    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 75
    :cond_3
    const/4 v1, 0x0

    :try_start_1
    aget-object v1, p1, v1
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    :goto_2
    if-eqz v1, :cond_4

    .line 80
    iget-object v2, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 81
    iget-object v2, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 82
    iget-object v2, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    :cond_4
    const/4 v1, 0x1

    :try_start_2
    aget-object v0, p1, v1
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 89
    :goto_3
    if-eqz v0, :cond_0

    .line 90
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setEnabled(Z)V

    .line 91
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setClickable(Z)V

    .line 92
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 76
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 77
    goto :goto_2

    .line 86
    :catch_1
    move-exception v1

    goto :goto_3

    .line 65
    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method public varargs setButtonText([I)V
    .locals 4

    .prologue
    .line 37
    array-length v0, p1

    new-array v1, v0, [Ljava/lang/CharSequence;

    .line 38
    const/4 v0, 0x0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    .line 39
    iget-object v2, p0, Lcom/qihoo/security/dialog/DialogButtons;->a:Lcom/qihoo/security/locale/d;

    aget v3, p1, v0

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 38
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0, v1}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonText([Ljava/lang/CharSequence;)V

    .line 42
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 99
    if-nez p1, :cond_1

    .line 100
    invoke-virtual {p0, v3}, Lcom/qihoo/security/dialog/DialogButtons;->setVisibility(I)V

    .line 119
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    iput-object p1, p0, Lcom/qihoo/security/dialog/DialogButtons;->g:[Ljava/lang/CharSequence;

    .line 104
    invoke-virtual {p0, v2}, Lcom/qihoo/security/dialog/DialogButtons;->setVisibility(I)V

    .line 105
    array-length v0, p1

    if-ne v0, v4, :cond_3

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->e:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->f:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->d:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setLocalText(Ljava/lang/CharSequence;)V

    .line 116
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->h:[Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->h:[Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogButtons;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 109
    :cond_3
    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->f:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->c:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setLocalText(Ljava/lang/CharSequence;)V

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogButtons;->b:Lcom/qihoo/security/widget/material/MaterialRippleButton;

    aget-object v1, p1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleButton;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method
