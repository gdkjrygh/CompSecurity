.class public final Lcom/roidapp/photogrid/release/ra;
.super Lcom/roidapp/photogrid/release/ao;
.source "SourceFile"


# instance fields
.field public G:Landroid/graphics/Matrix;

.field public H:Landroid/graphics/Matrix;

.field public I:Landroid/graphics/Matrix;

.field protected J:Landroid/graphics/Typeface;

.field protected K:Landroid/text/Layout$Alignment;

.field protected L:Ljava/lang/String;

.field protected M:I

.field protected final N:I

.field protected final O:I

.field protected P:I

.field protected Q:I

.field protected R:I

.field protected S:Landroid/graphics/Bitmap;

.field protected T:Landroid/graphics/Bitmap;

.field protected U:Landroid/graphics/Bitmap;

.field protected V:F

.field public W:Landroid/text/Layout;

.field public X:Landroid/text/Layout;

.field public Y:F

.field public Z:F

.field private aA:I

.field private aB:I

.field private aC:Landroid/graphics/PaintFlagsDrawFilter;

.field private aD:Landroid/text/TextPaint;

.field private aE:Landroid/text/TextPaint;

.field private aF:F

.field private aG:F

.field private aH:F

.field private final aI:I

.field private aJ:Landroid/content/SharedPreferences;

.field private final aK:Ljava/lang/String;

.field private final aL:Ljava/lang/String;

.field private final aM:Ljava/lang/String;

.field private final aN:Ljava/lang/String;

.field private final aO:Ljava/lang/String;

.field private final aP:Ljava/lang/String;

.field private final aQ:Ljava/lang/String;

.field private final aR:Ljava/lang/String;

.field private final aS:Ljava/lang/String;

.field private final aT:Ljava/lang/String;

.field private final aU:Ljava/lang/String;

.field private final aV:Ljava/lang/String;

.field private aW:F

.field private aX:Z

.field private aY:Z

.field private aZ:I

.field public aa:F

.field ab:[F

.field ac:[F

.field public ad:F

.field protected ae:I

.field protected af:I

.field protected ag:Z

.field protected ah:F

.field public ai:F

.field protected aj:I

.field protected ak:Z

.field protected al:Z

.field protected am:Z

.field protected an:Z

.field public ao:Ljava/lang/String;

.field public ap:I

.field public aq:Z

.field public ar:I

.field public as:I

.field public at:F

.field public au:F

.field public av:F

.field public aw:F

.field public ax:I

.field private ay:Ljava/lang/CharSequence;

.field private az:Landroid/graphics/Paint;

.field private ba:F

.field private bb:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 123
    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 129
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v0, 0x1

    const/high16 v6, -0x1000000

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 132
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ao;-><init>(Landroid/content/Context;)V

    .line 49
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 57
    iput v7, p0, Lcom/roidapp/photogrid/release/ra;->N:I

    .line 58
    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->O:I

    .line 59
    iput v7, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 66
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x3

    invoke-direct {v2, v1, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aC:Landroid/graphics/PaintFlagsDrawFilter;

    .line 69
    const/high16 v2, 0x41800000    # 16.0f

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 72
    const/high16 v2, 0x41f00000    # 30.0f

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 74
    iput v6, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 75
    const/16 v2, -0x15

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aI:I

    .line 76
    const/16 v2, -0x15

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 78
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 81
    iput v5, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 84
    const-string v2, "FREE_TEXT_F_COLOR"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aK:Ljava/lang/String;

    .line 85
    const-string v2, "FREE_TEXT_FONT"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aL:Ljava/lang/String;

    .line 86
    const-string v2, "FREE_TEXT_S_COLOR"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aM:Ljava/lang/String;

    .line 87
    const-string v2, "REE_TEXT_BG_COLOR"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aN:Ljava/lang/String;

    .line 88
    const-string v2, "REE_TEXT_BG_PI0"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aO:Ljava/lang/String;

    .line 89
    const-string v2, "REE_TEXT_BG_PI1"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aP:Ljava/lang/String;

    .line 90
    const-string v2, "free_text_alpha"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aQ:Ljava/lang/String;

    .line 91
    const-string v2, "free_text_stroke_scale"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aR:Ljava/lang/String;

    .line 92
    const-string v2, "free_text_shadow_color"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aS:Ljava/lang/String;

    .line 93
    const-string v2, "free_text_shadow_radius"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aT:Ljava/lang/String;

    .line 94
    const-string v2, "free_text_shadow_space"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aU:Ljava/lang/String;

    .line 95
    const-string v2, "free_text_show_shadow"

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aV:Ljava/lang/String;

    .line 97
    const/high16 v2, 0x3fc00000    # 1.5f

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    .line 99
    const/high16 v2, 0x40000000    # 2.0f

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    .line 100
    const/16 v2, 0xff

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 102
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->ak:Z

    .line 103
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->al:Z

    .line 104
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->am:Z

    .line 106
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->an:Z

    .line 110
    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 112
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->at:F

    .line 113
    const/high16 v2, 0x40200000    # 2.5f

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 115
    iput v6, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 116
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    .line 118
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    .line 119
    iput v5, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    .line 133
    iput-boolean p3, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    .line 134
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    .line 135
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    .line 136
    const/high16 v2, 0x40400000    # 3.0f

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    mul-float/2addr v2, v3

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    .line 137
    const/4 v2, 0x0

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    mul-float/2addr v2, v3

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aH:F

    .line 139
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "FREE_TEXT_F_COLOR"

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 140
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "FREE_TEXT_FONT"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ra;->b(I)Landroid/graphics/Typeface;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 141
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->M:I

    .line 142
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "FREE_TEXT_S_COLOR"

    const/4 v4, -0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 143
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "REE_TEXT_BG_COLOR"

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 144
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "REE_TEXT_BG_PI0"

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    .line 145
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "REE_TEXT_BG_PI1"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    .line 146
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_alpha"

    const/16 v4, 0xff

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 147
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_shadow_color"

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 148
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_stroke_scale"

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 149
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_shadow_radius"

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 150
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_shadow_space"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 151
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v3, "free_text_show_shadow"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 152
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v3

    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    .line 153
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-ge v2, v3, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    .line 154
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 155
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    .line 156
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->L:Ljava/lang/String;

    .line 157
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_1

    .line 158
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    .line 159
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    check-cast v0, Landroid/text/Editable;

    new-instance v2, Lcom/roidapp/photogrid/release/rb;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/rb;-><init>(Lcom/roidapp/photogrid/release/ra;B)V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/16 v4, 0x12

    invoke-interface {v0, v2, v1, v3, v4}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 165
    :goto_1
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    .line 166
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    .line 167
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    .line 168
    return-void

    :cond_0
    move v0, v1

    .line 153
    goto :goto_0

    .line 162
    :cond_1
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    goto :goto_1
.end method

.method private G()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 231
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    invoke-virtual {v0, v7}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ad:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aH:F

    .line 3992
    mul-float/2addr v1, v2

    .line 235
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 239
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/DynamicLayout;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mBgTextLayout:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Max:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 242
    return-void

    .line 239
    :cond_0
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    goto :goto_0
.end method

.method private H()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v3, 0x0

    .line 1225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    float-to-int v1, v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v1, v2

    mul-float/2addr v1, v4

    float-to-int v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    .line 1226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v1, v2

    mul-float/2addr v1, v4

    float-to-int v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    .line 1227
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    add-int/lit8 v1, v1, -0xa

    if-gt v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    add-int/lit8 v1, v1, -0xa

    if-le v0, v1, :cond_3

    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    if-lez v0, :cond_3

    .line 1228
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    if-le v0, v1, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v0, v0

    .line 1229
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    add-int/lit8 v1, v1, -0xa

    int-to-float v1, v1

    div-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    .line 1230
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    .line 1231
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    .line 1235
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Bitmap;)V

    .line 9294
    const/16 v0, 0x12

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput v3, v0, v1

    aput v3, v0, v5

    const/4 v1, 0x2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    const/4 v1, 0x3

    aput v3, v0, v1

    const/4 v1, 0x4

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/4 v1, 0x5

    aput v3, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/4 v1, 0x7

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0x8

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0x9

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0xa

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0xb

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0xc

    aput v3, v0, v1

    const/16 v1, 0xd

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0xe

    aput v3, v0, v1

    const/16 v1, 0xf

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0x10

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    const/16 v1, 0x11

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aput v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    .line 9299
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    .line 9300
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 9301
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    .line 9302
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    .line 9304
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->as:I

    if-ne v0, v5, :cond_1

    .line 9305
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->at:F

    cmpl-float v0, v0, v3

    if-nez v0, :cond_1

    .line 9306
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->at:F

    .line 1237
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->h()V

    .line 1238
    return-void

    .line 1228
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v0, v0

    goto/16 :goto_0

    .line 1233
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    goto/16 :goto_1
.end method

.method private static a(Landroid/text/TextPaint;Ljava/lang/String;)F
    .locals 6

    .prologue
    .line 1206
    const/4 v1, 0x0

    .line 1207
    const-string v0, "line.separator"

    const-string v2, "\n"

    invoke-static {v0, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 1208
    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v0, v3, v2

    .line 1209
    if-eqz v0, :cond_1

    .line 1212
    invoke-virtual {p0, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 1213
    cmpl-float v5, v0, v1

    if-lez v5, :cond_1

    .line 1208
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 1218
    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private static a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/DynamicLayout;
    .locals 8

    .prologue
    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 186
    :try_start_0
    const-class v0, Landroid/text/DynamicLayout;

    .line 187
    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/CharSequence;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-class v3, Landroid/text/TextPaint;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-class v3, Landroid/text/Layout$Alignment;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 189
    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aput-object p3, v1, v2

    const/4 v2, 0x4

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/DynamicLayout;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    :goto_0
    return-object v0

    .line 192
    :catch_0
    move-exception v0

    new-instance v0, Landroid/text/DynamicLayout;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Landroid/text/DynamicLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 614
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 617
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ra;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->H()V

    return-void
.end method

.method private a([F)Z
    .locals 9

    .prologue
    const/4 v3, 0x1

    const v1, 0x3f333333    # 0.7f

    const v0, 0x3dcccccd    # 0.1f

    const/4 v2, 0x0

    const/4 v8, 0x0

    .line 1295
    const/16 v4, 0x10

    aget v4, p1, v4

    cmpl-float v4, v4, v8

    if-lez v4, :cond_0

    const/16 v4, 0x10

    aget v4, p1, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v5, v5

    cmpg-float v4, v4, v5

    if-gez v4, :cond_0

    const/16 v4, 0x11

    aget v4, p1, v4

    cmpl-float v4, v4, v8

    if-lez v4, :cond_0

    const/16 v4, 0x11

    aget v4, p1, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v5, v5

    cmpg-float v4, v4, v5

    if-gez v4, :cond_0

    move v0, v2

    .line 1348
    :goto_0
    return v0

    .line 1299
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v4

    int-to-float v6, v4

    .line 1300
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v4

    int-to-float v7, v4

    .line 1304
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    if-le v4, v5, :cond_3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    move v5, v4

    .line 1308
    :goto_1
    cmpl-float v4, v5, v6

    if-lez v4, :cond_d

    .line 1309
    div-float v4, v5, v6

    div-float v4, v1, v4

    .line 1312
    :goto_2
    cmpl-float v6, v5, v7

    if-lez v6, :cond_1

    .line 1313
    div-float/2addr v5, v7

    div-float/2addr v1, v5

    .line 1316
    :cond_1
    cmpg-float v5, v4, v0

    if-gez v5, :cond_2

    move v4, v0

    .line 1320
    :cond_2
    cmpg-float v5, v1, v0

    if-gez v5, :cond_c

    .line 1326
    :goto_3
    const/16 v1, 0x12

    new-array v1, v1, [F

    .line 1327
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->F:Landroid/graphics/Matrix;

    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    .line 1328
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->F:Landroid/graphics/Matrix;

    const/16 v6, 0x10

    aget v6, p1, v6

    const/16 v7, 0x11

    aget v7, p1, v7

    invoke-virtual {v5, v4, v0, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->F:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 1331
    aget v0, v1, v2

    cmpl-float v0, v0, v8

    if-lez v0, :cond_4

    aget v0, v1, v2

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    aget v0, v1, v3

    cmpl-float v0, v0, v8

    if-lez v0, :cond_4

    aget v0, v1, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    move v0, v2

    .line 1332
    goto :goto_0

    .line 1304
    :cond_3
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    move v5, v4

    goto :goto_1

    .line 1333
    :cond_4
    const/4 v0, 0x2

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_5

    const/4 v0, 0x2

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_5

    const/4 v0, 0x3

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_5

    const/4 v0, 0x3

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_5

    move v0, v2

    .line 1334
    goto/16 :goto_0

    .line 1335
    :cond_5
    const/4 v0, 0x4

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_6

    const/4 v0, 0x4

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_6

    const/4 v0, 0x5

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_6

    const/4 v0, 0x5

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_6

    move v0, v2

    .line 1336
    goto/16 :goto_0

    .line 1337
    :cond_6
    const/4 v0, 0x6

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_7

    const/4 v0, 0x6

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_7

    const/4 v0, 0x7

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_7

    const/4 v0, 0x7

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_7

    move v0, v2

    .line 1338
    goto/16 :goto_0

    .line 1339
    :cond_7
    const/16 v0, 0x8

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_8

    const/16 v0, 0x8

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    const/16 v0, 0x9

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_8

    const/16 v0, 0x9

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    move v0, v2

    .line 1340
    goto/16 :goto_0

    .line 1341
    :cond_8
    const/16 v0, 0xa

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_9

    const/16 v0, 0xa

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    const/16 v0, 0xb

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_9

    const/16 v0, 0xb

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    move v0, v2

    .line 1342
    goto/16 :goto_0

    .line 1343
    :cond_9
    const/16 v0, 0xc

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_a

    const/16 v0, 0xc

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    const/16 v0, 0xd

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_a

    const/16 v0, 0xd

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    move v0, v2

    .line 1344
    goto/16 :goto_0

    .line 1345
    :cond_a
    const/16 v0, 0xe

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_b

    const/16 v0, 0xe

    aget v0, v1, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    const/16 v0, 0xf

    aget v0, v1, v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_b

    const/16 v0, 0xf

    aget v0, v1, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_b

    move v0, v2

    .line 1346
    goto/16 :goto_0

    :cond_b
    move v0, v3

    .line 1348
    goto/16 :goto_0

    :cond_c
    move v0, v1

    goto/16 :goto_3

    :cond_d
    move v4, v1

    goto/16 :goto_2
.end method

.method private b(Z)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 508
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    if-ne v1, v0, :cond_e

    .line 510
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v3, v5

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v1, v3

    float-to-int v3, v1

    .line 511
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v1, v1

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v4, v5

    sub-float/2addr v1, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v1, v4

    float-to-int v1, v1

    .line 512
    if-nez p1, :cond_10

    .line 513
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v1

    .line 514
    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v3, v5

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v3, v4

    sub-float/2addr v1, v3

    float-to-int v3, v1

    .line 515
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v1

    int-to-float v1, v1

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v4, v5

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v4, v5

    sub-float/2addr v1, v4

    float-to-int v1, v1

    move v4, v3

    move v3, v1

    .line 517
    :goto_0
    if-lez v4, :cond_0

    if-gtz v3, :cond_1

    .line 610
    :cond_0
    :goto_1
    return-void

    .line 521
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 523
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->aq:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 524
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    const-string v5, ""

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 527
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ap:I

    if-ne v1, v0, :cond_3

    .line 528
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    .line 529
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    .line 530
    if-eqz p1, :cond_0

    .line 531
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "bg create decodeBitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 537
    :cond_3
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 538
    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 539
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    invoke-static {v1, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 540
    iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v1, v4

    .line 541
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v6, v3

    if-le v1, v6, :cond_4

    .line 542
    iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v1, v3

    .line 544
    :cond_4
    if-gtz v1, :cond_f

    .line 547
    :goto_2
    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 548
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 549
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    invoke-static {v0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 550
    int-to-float v1, v4

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v6

    div-float/2addr v1, v6

    .line 551
    int-to-float v6, v3

    iget v5, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v5, v5

    div-float v5, v6, v5

    .line 552
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0, v1, v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    .line 570
    :cond_5
    :goto_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    .line 8590
    invoke-static {v0, v1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 570
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    .line 572
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 576
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    rem-int v0, v4, v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    :goto_4
    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aA:I

    .line 577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    rem-int v0, v3, v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    :goto_5
    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aB:I

    .line 580
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    .line 582
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget-object v0, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v3, v0}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 588
    :goto_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    if-nez v0, :cond_a

    .line 589
    if-eqz p1, :cond_0

    .line 590
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBg==null  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 556
    :cond_7
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 557
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 559
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v5

    iget-object v5, v5, Lcom/roidapp/baselib/c/p;->j:[[I

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    aget-object v5, v5, v6

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    aget v5, v5, v6

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-static {v0, v5, v1, v6}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 561
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;->printStackTrace()V

    .line 563
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    .line 564
    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    .line 565
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v5

    iget-object v5, v5, Lcom/roidapp/baselib/c/p;->j:[[I

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    aget-object v5, v5, v6

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    aget v5, v5, v6

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-static {v0, v5, v1, v6}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    goto/16 :goto_3

    .line 576
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int v0, v4, v0

    goto/16 :goto_4

    .line 577
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int v0, v3, v0

    goto :goto_5

    .line 584
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 585
    iput-object v8, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    goto :goto_6

    .line 595
    :cond_a
    new-instance v3, Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 596
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aC:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    move v0, v2

    .line 598
    :goto_7
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aB:I

    if-ge v0, v1, :cond_c

    move v1, v2

    .line 599
    :goto_8
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aA:I

    if-ge v1, v4, :cond_b

    .line 600
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    mul-int/2addr v6, v1

    int-to-float v6, v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int/2addr v7, v0

    int-to-float v7, v7

    invoke-virtual {v3, v4, v6, v7, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 599
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 598
    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 604
    :cond_c
    if-eqz v5, :cond_d

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_d

    .line 605
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 607
    :cond_d
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 609
    :cond_e
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->h()V

    goto/16 :goto_1

    :cond_f
    move v0, v1

    goto/16 :goto_2

    :cond_10
    move v4, v3

    move v3, v1

    goto/16 :goto_0
.end method

.method private c(Z)V
    .locals 1

    .prologue
    .line 644
    if-nez p1, :cond_0

    .line 645
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Bitmap;)V

    .line 647
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->b(Z)V

    .line 648
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .prologue
    .line 1241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final B()Z
    .locals 1

    .prologue
    .line 1245
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aY:Z

    return v0
.end method

.method public final C()V
    .locals 1

    .prologue
    .line 1252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aY:Z

    .line 1253
    return-void
.end method

.method public final D()V
    .locals 1

    .prologue
    .line 1259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aY:Z

    .line 1260
    return-void
.end method

.method public final E()Z
    .locals 1

    .prologue
    .line 1286
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->an:Z

    return v0
.end method

.method public final F()V
    .locals 1

    .prologue
    .line 1290
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->an:Z

    .line 1291
    return-void
.end method

.method public final a(Landroid/graphics/Typeface;)I
    .locals 3

    .prologue
    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 824
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 825
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 827
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    .line 828
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 831
    :goto_0
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final synthetic a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;
    .locals 3

    .prologue
    .line 46
    .line 9935
    new-instance v0, Lcom/roidapp/photogrid/release/ra;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 9936
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    .line 9937
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    .line 9938
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    .line 9939
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    .line 9940
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    .line 9941
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->g:Ljava/lang/String;

    .line 9942
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->j:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 9943
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->k:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 9944
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->l:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->l:F

    .line 9945
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->p:I

    .line 9946
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->q:I

    .line 9947
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 9948
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->r:[F

    .line 9949
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->s:I

    .line 9950
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->t:I

    .line 9951
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 9952
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 9954
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    .line 9955
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 9956
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 9957
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->Q:I

    .line 9958
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->R:I

    .line 9959
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    .line 9960
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    .line 9961
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->V:F

    .line 9962
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->Y:F

    .line 9963
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->Z:F

    .line 9964
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ad:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 9965
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aH:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->aH:F

    .line 9966
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    .line 9967
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 9968
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 9969
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 9970
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 9972
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 9975
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    .line 9976
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ap:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ap:I

    .line 9977
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->aq:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ra;->aq:Z

    .line 9978
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 9979
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->as:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->as:I

    .line 9980
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->at:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->at:F

    .line 9982
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 9983
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 9984
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 9985
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 9986
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 9987
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 46
    return-object v0
.end method

.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 622
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 623
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ra;->S:Landroid/graphics/Bitmap;

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 626
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 627
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    .line 629
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 630
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 633
    :cond_2
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 781
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 783
    const-string v1, "REE_TEXT_BG_COLOR"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 784
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 785
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 792
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    .line 793
    iput p2, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    .line 794
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 795
    const-string v1, "REE_TEXT_BG_PI0"

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 796
    const-string v1, "REE_TEXT_BG_PI1"

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 797
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 798
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ra;->a(I)V

    .line 799
    return-void
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    const/16 v8, -0x15

    const/high16 v7, 0x40800000    # 4.0f

    const/4 v5, 0x1

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 316
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aC:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 317
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 319
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    if-ne v0, v5, :cond_2

    .line 320
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    aget v3, v3, v5

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    aget v4, v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 4892
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 324
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 338
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 340
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 341
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 342
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    if-eq v0, v8, :cond_1

    .line 343
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-eqz v0, :cond_5

    .line 344
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    if-eqz v0, :cond_4

    .line 345
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    shl-int/lit8 v0, v0, 0x18

    .line 346
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    const v3, 0xffffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    .line 347
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 354
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    div-float/2addr v2, v6

    add-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    div-float/2addr v2, v7

    add-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v2, v3

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 355
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 358
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 360
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 362
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-eqz v0, :cond_8

    .line 363
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    if-ne v0, v8, :cond_7

    .line 364
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    if-eqz v0, :cond_6

    .line 365
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    shl-int/lit8 v0, v0, 0x18

    .line 366
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    const v2, 0xffffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 367
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 377
    :goto_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    div-float/2addr v1, v6

    add-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    div-float/2addr v1, v7

    add-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 380
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 381
    return-void

    .line 327
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    .line 328
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 329
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    if-eq v0, v5, :cond_3

    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 335
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 5892
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 335
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 336
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v2, v6

    sub-float v3, v0, v2

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v2, v6

    sub-float v4, v0, v2

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 332
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    .line 349
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_1

    .line 352
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_1

    .line 369
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_2

    .line 372
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_2

    .line 375
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_2
.end method

.method public final a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 6

    .prologue
    const/16 v5, 0x11

    const/16 v4, 0x10

    const/4 v1, 0x0

    .line 1263
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v2, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v2

    .line 1264
    iget v2, p2, Landroid/graphics/PointF;->y:F

    iget v3, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v3

    .line 1265
    neg-float v0, v0

    neg-float v2, v2

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 1266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 1267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->a([F)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1269
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v0, v0, v4

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v0, v0, v4

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_4

    .line 1270
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v2

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 1271
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v4

    sub-float/2addr v0, v2

    .line 1273
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v5

    cmpg-float v2, v2, v1

    if-ltz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v5

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    .line 1274
    :cond_1
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x4

    int-to-float v1, v1

    .line 1275
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v5

    sub-float/2addr v1, v2

    .line 1277
    :cond_2
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 1279
    :cond_3
    return-void

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public final a(Landroid/text/Layout$Alignment;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 869
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    if-ne v0, p1, :cond_1

    .line 889
    :cond_0
    :goto_0
    return-void

    .line 872
    :cond_1
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    .line 873
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {p1, v0}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 874
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 881
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    if-eqz v0, :cond_0

    .line 882
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    float-to-int v2, v2

    invoke-static {v0, v1, v2, p1}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/DynamicLayout;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    .line 884
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    if-eqz v0, :cond_0

    .line 885
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    float-to-int v2, v2

    invoke-static {v0, v1, v2, p1}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/DynamicLayout;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    goto :goto_0

    .line 875
    :cond_3
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {p1, v0}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 876
    iput v6, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    goto :goto_1

    .line 877
    :cond_4
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    invoke-virtual {p1, v0}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 878
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    neg-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    goto :goto_1

    .line 882
    :cond_5
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    float-to-int v3, v3

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    goto :goto_2

    .line 885
    :cond_6
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    float-to-int v3, v3

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    goto :goto_3
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 911
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_0

    .line 912
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    check-cast v0, Landroid/text/Editable;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {v0, v2, v1, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 920
    :goto_0
    return-void

    .line 915
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    .line 916
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->a()V

    .line 8636
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 8640
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ra;->c(Z)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 1282
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 1283
    return-void
.end method

.method public final a(F)Z
    .locals 13

    .prologue
    const/high16 v12, 0x40000000    # 2.0f

    const/4 v3, 0x0

    const/16 v11, 0x11

    const/16 v10, 0x10

    const/4 v2, 0x1

    .line 688
    .line 689
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v0, v1

    float-to-int v4, v0

    .line 690
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v0, v1

    float-to-int v5, v0

    .line 691
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 693
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v0, v0, v10

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v6, v6, v11

    invoke-virtual {v1, p1, p1, v0, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 694
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 696
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v1, v0, v6}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 698
    aget v1, v0, v3

    aget v6, v0, v2

    const/16 v7, 0xc

    aget v7, v0, v7

    const/16 v8, 0xd

    aget v8, v0, v8

    invoke-static {v1, v6, v7, v8}, Lcom/roidapp/photogrid/release/ra;->a(FFFF)F

    move-result v1

    .line 699
    aget v6, v0, v3

    aget v7, v0, v2

    const/4 v8, 0x4

    aget v8, v0, v8

    const/4 v9, 0x5

    aget v0, v0, v9

    invoke-static {v6, v7, v8, v0}, Lcom/roidapp/photogrid/release/ra;->a(FFFF)F

    move-result v0

    .line 700
    cmpl-float v6, v1, v0

    if-ltz v6, :cond_0

    move v0, v1

    .line 701
    :cond_0
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    if-lt v1, v6, :cond_3

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 703
    :goto_0
    int-to-float v1, v1

    const v6, 0x3f666666    # 0.9f

    mul-float/2addr v1, v6

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_4

    .line 704
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 705
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v3, v3, v11

    invoke-virtual {v0, p1, p1, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 706
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v3, v3, v11

    invoke-virtual {v0, p1, p1, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 707
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v3, v3, v11

    invoke-virtual {v0, p1, p1, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 708
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ra;->c(Z)V

    move v0, v2

    .line 711
    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->j:F

    int-to-float v2, v4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v3, v4

    sub-float/2addr v2, v3

    div-float/2addr v2, v12

    add-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 712
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->k:F

    int-to-float v2, v5

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v3, v4

    sub-float/2addr v2, v3

    div-float/2addr v2, v12

    add-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 713
    return v0

    .line 701
    :cond_3
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    goto :goto_0

    :cond_4
    move v0, v3

    goto :goto_1
.end method

.method public final b(I)Landroid/graphics/Typeface;
    .locals 2

    .prologue
    .line 811
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 812
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 814
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    goto :goto_0
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 1362
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    if-nez v0, :cond_0

    .line 1366
    :goto_0
    return-void

    .line 1365
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->D:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v2, 0x10

    aget v1, v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->E:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v3, 0x11

    aget v2, v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    goto :goto_0
.end method

.method public final b(F)V
    .locals 5

    .prologue
    const/16 v4, 0x11

    const/16 v3, 0x10

    .line 680
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v4

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 682
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v4

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 683
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v1, v1, v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v2, v2, v4

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 684
    return-void
.end method

.method public final b(FF)V
    .locals 1

    .prologue
    .line 665
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ao;->b(FF)V

    .line 666
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 667
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 668
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 669
    return-void
.end method

.method public final b(FFFF)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 757
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 758
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 759
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 761
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    .line 762
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 764
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 767
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 768
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 770
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->l:F

    .line 771
    invoke-virtual {p0, p2}, Lcom/roidapp/photogrid/release/ra;->b(F)V

    .line 772
    invoke-virtual {p0, p3, p4}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 773
    return-void
.end method

.method public final b(II)V
    .locals 3

    .prologue
    const/high16 v2, 0x44a00000    # 1280.0f

    .line 1142
    if-le p1, p2, :cond_0

    .line 1143
    int-to-float v0, p1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    .line 1147
    :goto_0
    return-void

    .line 1145
    :cond_0
    int-to-float v0, p2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    goto :goto_0
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 12
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/high16 v11, 0x40800000    # 4.0f

    const/4 v10, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 390
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    if-gez v0, :cond_0

    invoke-static {}, Lcom/roidapp/baselib/c/n;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aZ:I

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aC:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 395
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 396
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    if-ne v0, v8, :cond_2

    .line 397
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 398
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    aget v2, v2, v10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    aget v3, v3, v10

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->ab:[F

    aget v3, v3, v8

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->ac:[F

    aget v4, v4, v8

    sub-float/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 400
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 401
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 6892
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 401
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 402
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 414
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 415
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 419
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 426
    :goto_1
    if-nez v0, :cond_4

    .line 427
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "textItem setBitmap mTextTmp==null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 404
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    .line 405
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 406
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    if-eq v0, v8, :cond_3

    .line 407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ar:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 411
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    .line 7892
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 411
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 412
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v2, v9

    sub-float v3, v0, v2

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float/2addr v2, v9

    sub-float v4, v0, v2

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 409
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->az:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 421
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 422
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 423
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 424
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1

    .line 429
    :cond_4
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 430
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 431
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->ba:F

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 432
    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 433
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aC:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 435
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    const/16 v4, -0x15

    if-eq v3, v4, :cond_6

    .line 436
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    if-nez v3, :cond_5

    .line 437
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->G()V

    .line 439
    :cond_5
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 440
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 441
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-eqz v3, :cond_d

    .line 442
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    if-eqz v3, :cond_c

    .line 443
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    shl-int/lit8 v3, v3, 0x18

    .line 444
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    const v5, 0xffffff

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    .line 445
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v7, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    invoke-virtual {v4, v5, v6, v7, v3}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 452
    :goto_3
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    div-float/2addr v4, v9

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    div-float/2addr v4, v11

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 453
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->X:Landroid/text/Layout;

    invoke-virtual {v3, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 454
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 456
    :cond_6
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 457
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 459
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-eqz v3, :cond_10

    .line 460
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    const/16 v4, -0x15

    if-ne v3, v4, :cond_f

    .line 461
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ra;->aX:Z

    if-eqz v3, :cond_e

    .line 462
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    shl-int/lit8 v3, v3, 0x18

    .line 463
    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    const v5, 0xffffff

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    .line 464
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v7, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    invoke-virtual {v4, v5, v6, v7, v3}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 474
    :goto_4
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->Z:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    div-float/2addr v4, v9

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    div-float/2addr v4, v11

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->Y:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 475
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    invoke-virtual {v3, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 476
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 478
    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 479
    const/high16 v2, -0x3ee00000    # -10.0f

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 480
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 481
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ra;->f:Z

    if-eqz v1, :cond_9

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-eq v1, v2, :cond_9

    .line 482
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 483
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->h()V

    .line 485
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 487
    :cond_9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 488
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->a([F)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 490
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->B:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->e:Landroid/graphics/Point;

    if-eqz v0, :cond_b

    .line 491
    iput-boolean v8, p0, Lcom/roidapp/photogrid/release/ra;->C:Z

    .line 8353
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    if-eqz v0, :cond_a

    .line 8356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v1, 0x10

    aget v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->D:I

    .line 8357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v1, 0x11

    aget v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->E:I

    .line 493
    :cond_a
    iput-boolean v8, p0, Lcom/roidapp/photogrid/release/ra;->B:Z

    .line 500
    :cond_b
    :goto_5
    return-void

    .line 447
    :cond_c
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v7, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_3

    .line 450
    :cond_d
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_3

    .line 466
    :cond_e
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v7, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_4

    .line 469
    :cond_f
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_4

    .line 472
    :cond_10
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    iget v6, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    goto/16 :goto_4

    .line 497
    :cond_11
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ra;->B:Z

    .line 498
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ra;->C:Z

    goto :goto_5
.end method

.method public final b(Landroid/graphics/Typeface;)V
    .locals 3

    .prologue
    .line 852
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    if-ne v0, p1, :cond_0

    .line 862
    :goto_0
    return-void

    .line 853
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 854
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->M:I

    .line 856
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 857
    const-string v1, "FREE_TEXT_FONT"

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->M:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 858
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 860
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 861
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->c(Z)V

    goto :goto_0
.end method

.method protected final c(F)V
    .locals 11

    .prologue
    const/4 v6, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    const/16 v9, 0x11

    const/16 v8, 0x10

    const/4 v7, 0x1

    .line 722
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    .line 723
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    if-le v1, v2, :cond_0

    .line 724
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    .line 727
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    aget v1, v1, v6

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    aget v2, v2, v7

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    const/16 v4, 0xc

    aget v3, v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    const/16 v5, 0xd

    aget v4, v4, v5

    invoke-static {v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/ra;->a(FFFF)F

    move-result v1

    .line 728
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    aget v2, v2, v6

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    aget v3, v3, v7

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    const/4 v5, 0x4

    aget v4, v4, v5

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->n:[F

    const/4 v6, 0x5

    aget v5, v5, v6

    invoke-static {v2, v3, v4, v5}, Lcom/roidapp/photogrid/release/ra;->a(FFFF)F

    move-result v2

    .line 729
    cmpl-float v3, v1, v2

    if-lez v3, :cond_1

    .line 730
    div-float/2addr v0, v1

    .line 735
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 736
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 738
    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v3, v0

    iput v3, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 740
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v4, v4, v8

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v5, v5, v9

    invoke-virtual {v3, v0, v0, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 741
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v4, v4, v8

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v5, v5, v9

    invoke-virtual {v3, v0, v0, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 742
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v4, v4, v8

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ra;->o:[F

    aget v5, v5, v9

    invoke-virtual {v3, v0, v0, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 743
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/ra;->c(Z)V

    .line 745
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->j:F

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v3, v4

    sub-float/2addr v1, v3

    div-float/2addr v1, v10

    add-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 746
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->k:F

    int-to-float v1, v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    add-float/2addr v2, v3

    sub-float/2addr v1, v2

    div-float/2addr v1, v10

    add-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 747
    return-void

    .line 732
    :cond_1
    div-float/2addr v0, v2

    goto :goto_0
.end method

.method protected final c(FF)V
    .locals 2

    .prologue
    .line 672
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v0, v1

    add-float/2addr v0, p1

    .line 673
    invoke-super {p0, v0, p2}, Lcom/roidapp/photogrid/release/ao;->b(FF)V

    .line 674
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 675
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 676
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 677
    return-void
.end method

.method public final c(I)V
    .locals 2

    .prologue
    .line 843
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/ra;->b(I)Landroid/graphics/Typeface;

    move-result-object v0

    .line 844
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    if-ne v1, v0, :cond_0

    .line 848
    :goto_0
    return-void

    .line 847
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V

    goto :goto_0
.end method

.method public final d(F)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1058
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-nez v0, :cond_0

    .line 1059
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 1060
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1061
    const-string v1, "free_text_show_shadow"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1062
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1064
    :cond_0
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 1065
    return-void
.end method

.method public final d(FF)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1080
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-nez v0, :cond_0

    .line 1081
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1083
    const-string v1, "free_text_show_shadow"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1084
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1086
    :cond_0
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 1087
    iput p2, p0, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 1089
    return-void
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 900
    if-ltz p1, :cond_0

    const/16 v0, 0xff

    if-le p1, v0, :cond_1

    .line 904
    :cond_0
    :goto_0
    return-void

    .line 903
    :cond_1
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    goto :goto_0
.end method

.method public final e(F)V
    .locals 0

    .prologue
    .line 1132
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    .line 1133
    return-void
.end method

.method public final e(FF)V
    .locals 4

    .prologue
    .line 1158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_0

    mul-float v0, p1, p2

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->h:F

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 1159
    div-float v0, p1, p2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 1164
    :goto_0
    return-void

    .line 1162
    :cond_0
    mul-float v0, p1, p2

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    goto :goto_0
.end method

.method public final e(I)V
    .locals 2

    .prologue
    .line 998
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    if-ne v0, p1, :cond_0

    .line 1006
    :goto_0
    return-void

    .line 1001
    :cond_0
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 1002
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1003
    const-string v1, "FREE_TEXT_F_COLOR"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1004
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1005
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->g()V

    goto :goto_0
.end method

.method public final f(F)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/16 v2, -0x15

    .line 1170
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 1171
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 1172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    if-eqz v0, :cond_0

    .line 1173
    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 1190
    :cond_0
    :goto_0
    return-void

    .line 1176
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    if-eqz v0, :cond_3

    .line 1177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    const-string v1, "FREE_TEXT_S_COLOR"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 1178
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    if-ne v0, v2, :cond_2

    .line 1179
    iput v3, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 1181
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p1

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aW:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 1182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aE:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0

    .line 1186
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->G()V

    goto :goto_0
.end method

.method public final f(I)V
    .locals 2

    .prologue
    .line 1017
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    if-ne v0, p1, :cond_0

    .line 1025
    :goto_0
    return-void

    .line 1020
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1021
    const-string v1, "FREE_TEXT_S_COLOR"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1022
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1023
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 1024
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->G()V

    goto :goto_0
.end method

.method public final g()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 199
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    .line 200
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    invoke-virtual {v0, v7}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ad:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aH:F

    .line 2992
    mul-float/2addr v1, v2

    .line 203
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    const-string v1, "\u3002."

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    .line 211
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    :goto_0
    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 220
    :cond_0
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    const/16 v1, -0x15

    if-eq v0, v1, :cond_1

    .line 221
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->G()V

    .line 223
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->bb:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/DynamicLayout;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    .line 226
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ra;->H()V

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mTextLayout:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Max:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 228
    return-void

    .line 211
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/text/TextPaint;Ljava/lang/String;)F

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    add-float/2addr v0, v1

    goto :goto_0

    .line 214
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 215
    iput v6, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    goto :goto_1

    .line 216
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1}, Landroid/text/Layout$Alignment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aG:F

    neg-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->aa:F

    goto :goto_1

    .line 223
    :cond_5
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->aD:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->aF:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    goto :goto_2
.end method

.method public final g(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1035
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    if-nez v0, :cond_0

    .line 1036
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 1037
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1038
    const-string v1, "free_text_show_shadow"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1039
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1042
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    if-ne v0, p1, :cond_1

    .line 1049
    :goto_0
    return-void

    .line 1045
    :cond_1
    iput p1, p0, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 1046
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1047
    const-string v1, "free_text_shadow_color"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1048
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method public final h()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 245
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    .line 290
    :cond_0
    :goto_0
    return-void

    .line 248
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    if-lez v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ak:Z

    if-nez v0, :cond_3

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 257
    :cond_3
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    .line 259
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 273
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    if-nez v0, :cond_4

    .line 274
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBorder==null  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 261
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "OOM:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 263
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 264
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 265
    const-string v0, "Text"

    const-string v2, "OOM, use ARGB_4444 to create again"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 270
    :catch_1
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 276
    :cond_4
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 277
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 278
    const v0, -0xc39b2b

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 279
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 280
    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v3, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v4, v2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 281
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 282
    const v2, 0xffffff

    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 283
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 284
    iget v1, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ra;->s:I

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ra;->t:I

    int-to-float v4, v4

    iget v7, p0, Lcom/roidapp/photogrid/release/ra;->ai:F

    sub-float/2addr v4, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 286
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 287
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 288
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_0
.end method

.method public final i()V
    .locals 0

    .prologue
    .line 636
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 637
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 640
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->c(Z)V

    .line 641
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 651
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->b(Z)V

    .line 652
    return-void
.end method

.method public final l()V
    .locals 1

    .prologue
    .line 658
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ra;->b(Z)V

    .line 659
    return-void
.end method

.method public final m()I
    .locals 1

    .prologue
    .line 788
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    return v0
.end method

.method public final n()[I
    .locals 3

    .prologue
    .line 802
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->Q:I

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->R:I

    aput v2, v0, v1

    return-object v0
.end method

.method public final o()I
    .locals 1

    .prologue
    .line 839
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->M:I

    return v0
.end method

.method public final p()Landroid/text/Layout$Alignment;
    .locals 1

    .prologue
    .line 865
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final q()I
    .locals 1

    .prologue
    .line 892
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->aj:I

    return v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 907
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->ay:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final s()I
    .locals 1

    .prologue
    .line 1009
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ae:I

    return v0
.end method

.method public final t()I
    .locals 1

    .prologue
    .line 1028
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    return v0
.end method

.method public final u()V
    .locals 3

    .prologue
    const/16 v2, -0x15

    .line 1094
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    if-eqz v0, :cond_0

    .line 1095
    iput v2, p0, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1097
    const-string v1, "FREE_TEXT_S_COLOR"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1098
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1100
    :cond_0
    return-void
.end method

.method public final v()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->W:Landroid/text/Layout;

    if-eqz v0, :cond_0

    .line 1107
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 1108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1109
    const-string v1, "free_text_show_shadow"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1110
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1112
    :cond_0
    return-void
.end method

.method public final w()Z
    .locals 1

    .prologue
    .line 1115
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    return v0
.end method

.method public final x()V
    .locals 3

    .prologue
    .line 1122
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ra;->aJ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1124
    const-string v1, "REE_TEXT_BG_COLOR"

    iget v2, p0, Lcom/roidapp/photogrid/release/ra;->P:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1125
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1126
    return-void
.end method

.method public final y()F
    .locals 1

    .prologue
    .line 1136
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->V:F

    return v0
.end method

.method public final z()F
    .locals 1

    .prologue
    .line 1196
    iget v0, p0, Lcom/roidapp/photogrid/release/ra;->ah:F

    return v0
.end method
