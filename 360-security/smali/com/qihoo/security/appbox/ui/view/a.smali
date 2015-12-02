.class public Lcom/qihoo/security/appbox/ui/view/a;
.super Lcom/qihoo/security/c/a/a;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/c/a/a",
        "<",
        "Lcom/qihoo/security/appbox/core/c;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/ads/NativeAd;",
            ">;"
        }
    .end annotation
.end field

.field private e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/c/a/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->c:Ljava/lang/String;

    .line 49
    const v0, 0x3ffa5e35    # 1.956f

    iput v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->e:F

    .line 53
    iput-object p3, p0, Lcom/qihoo/security/appbox/ui/view/a;->c:Ljava/lang/String;

    .line 54
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->d:Ljava/util/Set;

    .line 55
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->a:Ljava/util/List;

    return-object v0
.end method

.method protected a(Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 10

    .prologue
    .line 77
    const v0, 0x7f0b007f

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;

    .line 78
    const v1, 0x7f0b0080

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 79
    const v2, 0x7f0b0082

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RatingBar;

    .line 80
    const v3, 0x7f0b0081

    invoke-static {p1, v3}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 81
    const v4, 0x7f0b0083

    invoke-static {p1, v4}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 82
    const v5, 0x7f0b007e

    invoke-static {p1, v5}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    .line 83
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    const v5, 0x7f0b0084

    invoke-static {p1, v5}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    .line 85
    invoke-virtual {p0, p2}, Lcom/qihoo/security/appbox/ui/view/a;->getItem(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qihoo/security/appbox/core/c;

    .line 86
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/qihoo/security/appbox/core/c;->a(Ljava/lang/Object;)V

    .line 87
    invoke-virtual {v6, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 89
    iget-object v6, p0, Lcom/qihoo/security/appbox/ui/view/a;->c:Ljava/lang/String;

    const-string/jumbo v8, "0"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 90
    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 91
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v8

    int-to-float v8, v8

    iget v9, p0, Lcom/qihoo/security/appbox/ui/view/a;->e:F

    div-float/2addr v8, v9

    float-to-int v8, v8

    .line 92
    if-nez v6, :cond_0

    .line 93
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v9, -0x1

    invoke-direct {v6, v9, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 94
    invoke-virtual {v0, v6}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    :goto_0
    iget-object v6, v5, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    const v8, 0x7f02003f

    invoke-virtual {v0, v6, v8}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b(Ljava/lang/String;I)V

    .line 108
    :goto_1
    iget-object v6, v5, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    .line 109
    iget-boolean v0, v5, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v0, :cond_6

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->b:Landroid/content/Context;

    iget-object v8, v5, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-static {v0, v8}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 118
    :goto_2
    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 120
    iget v0, v5, Lcom/qihoo/security/appbox/core/c;->m:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 121
    iget v0, v5, Lcom/qihoo/security/appbox/core/c;->m:F

    invoke-virtual {v2, v0}, Landroid/widget/RatingBar;->setRating(F)V

    .line 125
    :goto_3
    iget-object v0, v5, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, v5, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_4

    .line 128
    iget-object v0, v5, Lcom/qihoo/security/appbox/core/c;->s:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    iget-object v0, v5, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    .line 130
    const/4 v1, 0x1

    iput-boolean v1, v5, Lcom/qihoo/security/appbox/core/c;->p:Z

    .line 131
    invoke-virtual {v0, v7}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 132
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/view/a;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 141
    :goto_4
    return-void

    .line 96
    :cond_0
    iput v8, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    .line 101
    :cond_1
    iget-boolean v6, v5, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v6, :cond_2

    .line 102
    iget-object v6, v5, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    const v8, 0x7f020041

    invoke-virtual {v0, v6, v8}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 104
    :cond_2
    iget-object v6, v5, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    const v8, 0x7f020040

    invoke-virtual {v0, v6, v8}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b(Ljava/lang/String;I)V

    goto :goto_1

    .line 123
    :cond_3
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {v2, v0}, Landroid/widget/RatingBar;->setRating(F)V

    goto :goto_3

    .line 134
    :cond_4
    iget-boolean v0, v5, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v0, :cond_5

    .line 135
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c01c3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 137
    :cond_5
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c01c4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_6
    move-object v0, v6

    goto :goto_2
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 62
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/view/a;->a:Ljava/util/List;

    .line 63
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/view/a;->notifyDataSetChanged()V

    .line 64
    return-void
.end method

.method protected b()I
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->c:Ljava/lang/String;

    const-string/jumbo v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    const v0, 0x7f030026

    .line 71
    :goto_0
    return v0

    :cond_0
    const v0, 0x7f030025

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 184
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 185
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/NativeAd;

    .line 187
    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    goto :goto_0

    .line 192
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/a;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 193
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 145
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    :goto_0
    return-void

    .line 148
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    .line 149
    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/c;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 150
    iget-object v2, v0, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    if-eqz v2, :cond_2

    .line 151
    const v2, 0x7f0b0084

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 152
    if-eqz v2, :cond_1

    .line 153
    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    .line 156
    :cond_1
    iget-object v0, v0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/bi/a;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 159
    :cond_2
    iget-boolean v2, v0, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v2, :cond_3

    .line 160
    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/view/a;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 163
    :try_start_0
    iget-object v3, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 164
    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/view/a;->b:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 166
    :catch_0
    move-exception v2

    .line 167
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v2

    const v3, 0x7f0c01c1

    invoke-virtual {v2, v3}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 168
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo/security/appbox/core/c;->c:Z

    .line 169
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/view/a;->notifyDataSetChanged()V

    .line 174
    :cond_3
    iget-object v2, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/qihoo/security/appbox/bi/a;->a(Ljava/lang/String;I)V

    .line 180
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/view/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/security/support/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/core/c;)V

    goto :goto_0
.end method
