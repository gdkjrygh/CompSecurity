.class public Lcom/qihoo/security/ui/result/card/view/FunctionCardView;
.super Lcom/qihoo/security/ui/result/card/view/CardView;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/qihoo/security/widget/CircleImageView;

.field private final b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final f:Landroid/view/ViewStub;

.field private g:Lcom/qihoo/security/ui/result/card/a;

.field private h:Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 153
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 154
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 158
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 161
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/card/view/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->c:Landroid/content/Context;

    const v1, 0x7f030056

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 164
    const v0, 0x7f0b0046

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CircleImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a:Lcom/qihoo/security/widget/CircleImageView;

    .line 165
    const v0, 0x7f0b004a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 166
    const v0, 0x7f0b00ae

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 167
    const v0, 0x7f0b0130

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->f:Landroid/view/ViewStub;

    .line 168
    const v0, 0x7f0b0131

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 169
    const v0, 0x7f0b012e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    return-void
.end method

.method private a(Landroid/view/View;I)Lcom/qihoo/security/widget/ImageView/RemoteImageView;
    .locals 1

    .prologue
    .line 117
    packed-switch p2, :pswitch_data_0

    .line 125
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 119
    :pswitch_0
    const v0, 0x7f0b0150

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    goto :goto_0

    .line 121
    :pswitch_1
    const v0, 0x7f0b0154

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    goto :goto_0

    .line 123
    :pswitch_2
    const v0, 0x7f0b0158

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    goto :goto_0

    .line 117
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/result/card/c$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v5, 0x7f02015d

    .line 73
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_9

    .line 74
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/card/c$a;

    .line 75
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a(Landroid/view/View;I)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->b:I

    if-eqz v3, :cond_5

    .line 78
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->b:I

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    .line 83
    :cond_0
    :goto_1
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->c:I

    if-eqz v3, :cond_1

    .line 84
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setColorFilter(I)V

    .line 85
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->c:I

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setBackgroundResource(I)V

    .line 87
    :cond_1
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->g:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 88
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->h:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    .line 89
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 90
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3, v5}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 97
    :cond_2
    :goto_2
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->b(Landroid/view/View;I)Landroid/widget/TextView;

    move-result-object v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->a:I

    if-eqz v3, :cond_7

    .line 100
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->a:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 105
    :cond_3
    :goto_3
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->c(Landroid/view/View;I)Landroid/widget/TextView;

    move-result-object v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->f:Ljava/lang/String;

    if-eqz v3, :cond_8

    .line 108
    iget-object v0, v0, Lcom/qihoo/security/ui/result/card/c$a;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :cond_4
    :goto_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 79
    :cond_5
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->d:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_0

    .line 80
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_1

    .line 91
    :cond_6
    iget v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->h:I

    if-nez v3, :cond_2

    .line 92
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 93
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3, v5}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    goto :goto_2

    .line 101
    :cond_7
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->e:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 102
    iget-object v3, v0, Lcom/qihoo/security/ui/result/card/c$a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 110
    :cond_8
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 114
    :cond_9
    return-void
.end method

.method private b(Landroid/view/View;I)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 129
    packed-switch p2, :pswitch_data_0

    .line 137
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 131
    :pswitch_0
    const v0, 0x7f0b0151

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 133
    :pswitch_1
    const v0, 0x7f0b0155

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 135
    :pswitch_2
    const v0, 0x7f0b0159

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 129
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(Landroid/view/View;I)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 141
    packed-switch p2, :pswitch_data_0

    .line 149
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 143
    :pswitch_0
    const v0, 0x7f0b0152

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 145
    :pswitch_1
    const v0, 0x7f0b0156

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 147
    :pswitch_2
    const v0, 0x7f0b015a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    .line 141
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->h:Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->h:Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->g:Lcom/qihoo/security/ui/result/card/a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;->a(Lcom/qihoo/security/ui/result/card/a;)V

    .line 216
    :cond_0
    return-void
.end method

.method public setBorderColor(I)V
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a:Lcom/qihoo/security/widget/CircleImageView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CircleImageView;->setColorFilter(I)V

    .line 178
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a:Lcom/qihoo/security/widget/CircleImageView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/CircleImageView;->setBorderColorResource(I)V

    .line 179
    return-void
.end method

.method public setCardViewData(Lcom/qihoo/security/ui/result/card/a;)V
    .locals 2

    .prologue
    .line 42
    if-eqz p1, :cond_5

    .line 43
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->g:Lcom/qihoo/security/ui/result/card/a;

    .line 44
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->c:I

    if-lez v0, :cond_0

    .line 45
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->c:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setImageResource(I)V

    .line 47
    :cond_0
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->b:I

    if-lez v0, :cond_1

    .line 48
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->b:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setBorderColor(I)V

    .line 50
    :cond_1
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 51
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setTitleText(Ljava/lang/Object;)V

    .line 53
    :cond_2
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    if-eqz v0, :cond_6

    .line 54
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setDescriptionText(Ljava/lang/Object;)V

    .line 58
    :goto_0
    instance-of v0, p1, Lcom/qihoo/security/ui/result/card/c;

    if-eqz v0, :cond_3

    move-object v0, p1

    .line 59
    check-cast v0, Lcom/qihoo/security/ui/result/card/c;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/card/c;->i:Ljava/util/ArrayList;

    .line 60
    if-eqz v0, :cond_3

    .line 61
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->f:Landroid/view/ViewStub;

    invoke-virtual {v1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v1

    .line 62
    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 65
    :cond_3
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 66
    iget-object v0, p1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setOperationText(Ljava/lang/Object;)V

    .line 68
    :cond_4
    invoke-virtual {p0, p0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    :cond_5
    return-void

    .line 56
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setDescriptionText(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 192
    instance-of v0, p1, Landroid/text/SpannableString;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/SpannableString;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    :goto_0
    return-void

    .line 194
    :cond_0
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/Spanned;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setImageResource(I)V
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->a:Lcom/qihoo/security/widget/CircleImageView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/CircleImageView;->setImageResource(I)V

    .line 174
    return-void
.end method

.method public setOnCardClickListener(Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->h:Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;

    .line 35
    return-void
.end method

.method public setOperationText(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 202
    instance-of v0, p1, Landroid/text/SpannableString;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/SpannableString;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    :goto_0
    return-void

    .line 204
    :cond_0
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/Spanned;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setTitleText(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 182
    instance-of v0, p1, Landroid/text/SpannableString;

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/SpannableString;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    :goto_0
    return-void

    .line 184
    :cond_0
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Landroid/text/Spanned;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
