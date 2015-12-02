.class public Lcom/facebook/orca/presence/PresenceIndicatorView;
.super Lcom/facebook/widget/f;
.source "PresenceIndicatorView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/ImageView;

.field private c:I

.field private d:Lcom/facebook/orca/presence/i;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:Lcom/facebook/orca/presence/f;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/presence/i;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lcom/facebook/orca/presence/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 70
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    const/4 v3, 0x0

    .line 73
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    sget-object v0, Lcom/facebook/orca/presence/i;->NONE:Lcom/facebook/orca/presence/i;

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->d:Lcom/facebook/orca/presence/i;

    .line 55
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->i:Ljava/util/Map;

    .line 60
    iput-boolean v5, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->j:Z

    .line 75
    sget-object v0, Lcom/facebook/q;->PresenceIndicatorView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 78
    sget v0, Lcom/facebook/q;->ThreadTitleView_chatStyle:I

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->g:Z

    .line 80
    iget-boolean v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->g:Z

    if-eqz v0, :cond_2

    .line 81
    sget v0, Lcom/facebook/k;->orca_chat_pop_up_presence_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setContentView(I)V

    .line 82
    sget-object v0, Lcom/facebook/orca/presence/i;->ONLINE:Lcom/facebook/orca/presence/i;

    sget v2, Lcom/facebook/h;->orca_online_icon_chat_head_title:I

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/i;I)V

    .line 84
    sget-object v0, Lcom/facebook/orca/presence/i;->PUSHABLE:Lcom/facebook/orca/presence/i;

    sget v2, Lcom/facebook/h;->orca_mobile_icon_chat_head_title:I

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/i;I)V

    .line 90
    :goto_0
    sget v0, Lcom/facebook/i;->presence_short_status:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    .line 91
    sget v0, Lcom/facebook/i;->presence_indicator_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    .line 93
    sget v0, Lcom/facebook/q;->PresenceIndicatorView_alignment:I

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    .line 95
    if-ne v0, v5, :cond_0

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 104
    iget-object v2, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 105
    iget-object v2, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 108
    :cond_0
    sget v0, Lcom/facebook/q;->PresenceIndicatorView_textColor:I

    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    .line 110
    if-ne v0, v4, :cond_1

    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/facebook/f;->default_contacts_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 113
    :cond_1
    invoke-virtual {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setTextColor(I)V

    .line 115
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 117
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 118
    const-class v1, Lcom/facebook/orca/presence/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/presence/d;

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->k:Lcom/facebook/orca/presence/d;

    .line 120
    return-void

    .line 87
    :cond_2
    sget v0, Lcom/facebook/k;->orca_presence_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setContentView(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/presence/g;)I
    .locals 2

    .prologue
    .line 220
    sget-object v0, Lcom/facebook/orca/presence/h;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/presence/g;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 233
    sget v0, Lcom/facebook/h;->orca_mobile_icon:I

    :goto_0
    return v0

    .line 222
    :pswitch_0
    sget v0, Lcom/facebook/h;->orca_mobile_green_stroke_icon:I

    goto :goto_0

    .line 224
    :pswitch_1
    sget v0, Lcom/facebook/h;->orca_mobile_yellow_dot_icon:I

    goto :goto_0

    .line 226
    :pswitch_2
    sget v0, Lcom/facebook/h;->orca_mobile_blue_dot_icon:I

    goto :goto_0

    .line 228
    :pswitch_3
    sget v0, Lcom/facebook/h;->orca_mobile_green_phone_icon:I

    goto :goto_0

    .line 230
    :pswitch_4
    sget v0, Lcom/facebook/h;->orca_mobile_white_phone_icon:I

    goto :goto_0

    .line 220
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private a()V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->k:Lcom/facebook/orca/presence/d;

    invoke-virtual {v0}, Lcom/facebook/orca/presence/d;->a()Lcom/facebook/orca/presence/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->d:Lcom/facebook/orca/presence/i;

    sget-object v1, Lcom/facebook/orca/presence/i;->ONLINE:Lcom/facebook/orca/presence/i;

    if-ne v0, v1, :cond_1

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    iget-object v0, v0, Lcom/facebook/orca/presence/f;->a:Lcom/facebook/orca/presence/g;

    sget-object v1, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    if-ne v0, v1, :cond_0

    .line 183
    sget-object v0, Lcom/facebook/orca/presence/i;->ONLINE:Lcom/facebook/orca/presence/i;

    sget v1, Lcom/facebook/h;->orca_online_icon:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->b(Lcom/facebook/orca/presence/i;I)V

    .line 195
    :goto_0
    return-void

    .line 185
    :cond_0
    sget-object v0, Lcom/facebook/orca/presence/i;->ONLINE:Lcom/facebook/orca/presence/i;

    sget v1, Lcom/facebook/h;->orca_mobile_green_dot_icon:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->b(Lcom/facebook/orca/presence/i;I)V

    goto :goto_0

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->d:Lcom/facebook/orca/presence/i;

    sget-object v1, Lcom/facebook/orca/presence/i;->PUSHABLE:Lcom/facebook/orca/presence/i;

    if-ne v0, v1, :cond_2

    .line 188
    invoke-direct {p0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->b()V

    goto :goto_0

    .line 189
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->d:Lcom/facebook/orca/presence/i;

    sget-object v1, Lcom/facebook/orca/presence/i;->NEARBY:Lcom/facebook/orca/presence/i;

    if-ne v0, v1, :cond_3

    .line 190
    sget-object v0, Lcom/facebook/orca/presence/i;->NEARBY:Lcom/facebook/orca/presence/i;

    sget v1, Lcom/facebook/h;->orca_nearby_icon:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->b(Lcom/facebook/orca/presence/i;I)V

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 193
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 241
    iget-boolean v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->j:Z

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 247
    :goto_0
    return-void

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/presence/i;I)V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->i:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    iget-boolean v0, v0, Lcom/facebook/orca/presence/f;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    iget-object v0, v0, Lcom/facebook/orca/presence/f;->a:Lcom/facebook/orca/presence/g;

    sget-object v1, Lcom/facebook/orca/presence/g;->GONE:Lcom/facebook/orca/presence/g;

    if-ne v0, v1, :cond_2

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 217
    :cond_1
    :goto_0
    return-void

    .line 206
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    iget-object v0, v0, Lcom/facebook/orca/presence/f;->a:Lcom/facebook/orca/presence/g;

    invoke-direct {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/g;)I

    move-result v0

    .line 208
    sget-object v1, Lcom/facebook/orca/presence/i;->PUSHABLE:Lcom/facebook/orca/presence/i;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->b(Lcom/facebook/orca/presence/i;I)V

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->h:Lcom/facebook/orca/presence/f;

    iget-boolean v0, v0, Lcom/facebook/orca/presence/f;->c:Z

    if-eqz v0, :cond_1

    .line 213
    const/4 v0, 0x3

    iget v1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->f:I

    rsub-int/lit8 v1, v1, 0x18

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit16 v0, v0, 0xff

    div-int/lit8 v0, v0, 0x18

    .line 214
    iget-object v1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAlpha(I)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/presence/i;I)V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(I)V

    .line 255
    :goto_0
    return-void

    .line 253
    :cond_0
    invoke-direct {p0, p2}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/presence/i;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/i;Ljava/lang/String;I)V

    .line 156
    return-void
.end method

.method public a(Lcom/facebook/orca/presence/i;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->d:Lcom/facebook/orca/presence/i;

    .line 167
    iput-object p2, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->e:Ljava/lang/String;

    .line 168
    iput p3, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->f:I

    .line 169
    invoke-direct {p0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a()V

    .line 170
    return-void
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 128
    iget v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->c:I

    return v0
.end method

.method public setShowIcon(Z)V
    .locals 0

    .prologue
    .line 132
    iput-boolean p1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->j:Z

    .line 133
    invoke-direct {p0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a()V

    .line 134
    return-void
.end method

.method public setStatus(Lcom/facebook/orca/presence/i;)V
    .locals 2

    .prologue
    .line 145
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/i;Ljava/lang/String;I)V

    .line 146
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .prologue
    .line 123
    iput p1, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->c:I

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/presence/PresenceIndicatorView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 125
    return-void
.end method
