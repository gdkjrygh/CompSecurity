.class public Lcom/qihoo/security/widget/CheckBoxPreference;
.super Landroid/widget/RelativeLayout;
.source "360Security"


# instance fields
.field public final a:Landroid/widget/CompoundButton;

.field private final b:Landroid/widget/ImageView;

.field private final c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final e:Landroid/widget/CompoundButton;

.field private final f:Landroid/view/View;

.field private final g:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    sget-object v0, Lcom/qihoo/security/lite/a$a;->Preference:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 51
    const/4 v0, 0x7

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    const v0, 0x7f030084

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 58
    :goto_0
    const v0, 0x7f0b01b4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->b:Landroid/widget/ImageView;

    .line 59
    const v0, 0x7f0b01b7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 60
    const v0, 0x7f0b01b8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 61
    const v0, 0x7f0b01bb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 62
    const v0, 0x7f0b01b9

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/switcher/Switch;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    .line 63
    const v0, 0x7f0b01ba

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    .line 64
    const v0, 0x7f0b01bc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->f:Landroid/view/View;

    .line 66
    const/4 v0, 0x6

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 68
    packed-switch v0, :pswitch_data_0

    .line 86
    :goto_1
    invoke-virtual {v3, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 87
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 88
    if-eqz v0, :cond_2

    .line 89
    iget-object v4, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 98
    :goto_2
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    .line 99
    cmpl-float v4, v0, v5

    if-eqz v4, :cond_0

    .line 100
    iget-object v4, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v4, v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextSize(IF)V

    .line 103
    :cond_0
    invoke-virtual {v3, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 104
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 105
    if-eqz v0, :cond_4

    .line 106
    iget-object v4, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v4, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 115
    :goto_3
    const/4 v0, 0x5

    invoke-virtual {v3, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 116
    iget-object v4, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->f:Landroid/view/View;

    if-eqz v0, :cond_6

    move v0, v1

    :goto_4
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 118
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 121
    const v0, 0x7f02011a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setBackgroundResource(I)V

    .line 122
    return-void

    .line 55
    :cond_1
    const v0, 0x7f030083

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    goto/16 :goto_0

    .line 70
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 72
    iput-boolean v1, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    goto :goto_1

    .line 75
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 76
    iput-boolean v1, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    goto :goto_1

    .line 79
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 80
    iput-boolean v6, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    goto :goto_1

    .line 91
    :cond_2
    if-eqz v4, :cond_3

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_2

    .line 95
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_2

    .line 108
    :cond_4
    if-eqz v4, :cond_5

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_3

    .line 112
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_3

    :cond_6
    move v0, v2

    .line 116
    goto :goto_4

    .line 68
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 135
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getLineCount()I

    move-result v0

    .line 136
    iget-object v1, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getLineCount()I

    move-result v1

    .line 138
    add-int/2addr v0, v1

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 139
    const v0, 0x7f0b01b5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 140
    if-eqz v0, :cond_0

    .line 141
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 142
    if-eqz v1, :cond_0

    .line 143
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x42b00000    # 88.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 144
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    :cond_0
    return-void
.end method

.method public a(Z)Z
    .locals 1

    .prologue
    .line 126
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 131
    :goto_0
    return p1

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_0
.end method

.method public setEnabled(Z)V
    .locals 1

    .prologue
    .line 221
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 222
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 227
    :goto_0
    if-eqz p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_1
    invoke-static {p0, v0}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 228
    return-void

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    goto :goto_0

    .line 227
    :cond_1
    const v0, 0x3ecccccd    # 0.4f

    goto :goto_1
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 1

    .prologue
    .line 198
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->h:Z

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->e:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 203
    :goto_0
    return-void

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->a:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_0
.end method

.method public setStatus(I)V
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 210
    :cond_0
    return-void
.end method

.method public setStatus(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->g:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 217
    :cond_0
    return-void
.end method

.method public setSummary(I)V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 175
    return-void
.end method

.method public setSummary(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 182
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 168
    return-void
.end method

.method public setTitleColor(I)V
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/widget/CheckBoxPreference;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 239
    :cond_0
    return-void
.end method
