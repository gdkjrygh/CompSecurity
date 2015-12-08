.class public final Lcom/roidapp/baselib/gl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/baselib/gl/c;

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 35
    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "GT-S5301"

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-string v2, "GT-I9082"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "GT-S7392"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "GT-S6810"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "GT-S6812"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "GT-S5310"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "GT-S5312"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "GT-I9105"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "GT-B5330"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "GT-S5303"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "GT-I9060"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "GT-S7270"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "GT-S7272"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "GT-I9150"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "GT-I9152"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "GT-S7580"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "S5"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/gl/c;->e:Ljava/util/List;

    .line 55
    new-array v0, v3, [Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/gl/c;->f:Ljava/util/List;

    .line 60
    new-array v0, v3, [Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/gl/c;->g:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/gl/c;->c:Z

    .line 66
    return-void
.end method

.method public static a()Lcom/roidapp/baselib/gl/c;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/roidapp/baselib/gl/c;->a:Lcom/roidapp/baselib/gl/c;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/roidapp/baselib/gl/c;

    invoke-direct {v0}, Lcom/roidapp/baselib/gl/c;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/gl/c;->a:Lcom/roidapp/baselib/gl/c;

    .line 72
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/gl/c;->a:Lcom/roidapp/baselib/gl/c;

    return-object v0
.end method

.method public static a(Landroid/os/Handler;Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 202
    if-eqz p2, :cond_0

    .line 203
    new-instance v0, Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/gl/GPUTestView;-><init>(Landroid/content/Context;)V

    .line 209
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->setId(I)V

    .line 210
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->setVisibility(I)V

    .line 212
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Landroid/os/Handler;)V

    .line 216
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 96
    const-string v1, "GPUINFO"

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 98
    const-string v2, "GPU_MODEL"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 99
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    const/4 v0, 0x1

    .line 102
    :cond_0
    return v0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 236
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 237
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 239
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 240
    :goto_0
    return v0

    .line 239
    :cond_1
    const/4 v0, 0x0

    .line 240
    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1092
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x8

    if-lt v2, v3, :cond_1

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v3, "2.1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v1

    .line 111
    :goto_0
    if-eqz v2, :cond_2

    invoke-static {p0}, Lcom/roidapp/baselib/c/n;->b(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v1

    .line 113
    :goto_1
    if-nez v2, :cond_3

    .line 116
    :cond_0
    :goto_2
    return v0

    :cond_1
    move v2, v0

    .line 1092
    goto :goto_0

    :cond_2
    move v2, v0

    .line 111
    goto :goto_1

    .line 115
    :cond_3
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 116
    sget-object v3, Lcom/roidapp/baselib/gl/c;->f:Ljava/util/List;

    invoke-static {v3, v2}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_2
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 266
    invoke-static {}, Lcom/roidapp/baselib/c/n;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1258
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1259
    sget-object v3, Lcom/roidapp/baselib/gl/c;->g:Ljava/util/List;

    invoke-static {v3, v2}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    .line 266
    :goto_0
    if-eqz v2, :cond_1

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 269
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 1262
    goto :goto_0

    :cond_1
    move v0, v1

    .line 269
    goto :goto_1
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 219
    iput-object p2, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    .line 221
    const-string v0, "GPUINFO"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 223
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "GPU_MODEL"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 224
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 76
    if-nez p1, :cond_0

    .line 79
    :goto_0
    return-void

    .line 78
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/roidapp/baselib/gl/c;->d:Ljava/util/List;

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/roidapp/baselib/gl/c;->c:Z

    .line 83
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 86
    iget-boolean v0, p0, Lcom/roidapp/baselib/gl/c;->c:Z

    return v0
.end method

.method public final c()Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 130
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 133
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    const-string v3, "VideoCore IV HW"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    const-string v3, "VideoCore IV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    const-string v3, "N/A"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 137
    :cond_0
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 139
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->d:Ljava/util/List;

    .line 140
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    .line 141
    :cond_1
    sget-object v0, Lcom/roidapp/baselib/gl/c;->e:Ljava/util/List;

    .line 144
    :cond_2
    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v1

    .line 164
    :goto_0
    return v0

    .line 147
    :cond_3
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 148
    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 149
    goto :goto_0

    :cond_4
    move v0, v2

    .line 152
    goto :goto_0

    .line 156
    :cond_5
    const-string v0, "GT-S5360"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S5363"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S5367"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S6102"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-B5512"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S5830"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S6802"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S7272"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "LG-P509"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "GT-S5300"

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move v0, v2

    .line 161
    goto :goto_0

    :cond_7
    move v0, v1

    .line 164
    goto :goto_0
.end method

.method public final c(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 171
    const-string v0, "GPUINFO"

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 173
    const-string v3, "GPU_MODEL"

    const-string v4, ""

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 176
    const-string v3, "VideoCore IV HW"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "VideoCore IV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 178
    :cond_0
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->d:Ljava/util/List;

    .line 181
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    .line 182
    :cond_1
    sget-object v0, Lcom/roidapp/baselib/gl/c;->e:Ljava/util/List;

    .line 185
    :cond_2
    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v1

    .line 195
    :goto_0
    return v0

    .line 188
    :cond_3
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 189
    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 190
    goto :goto_0

    :cond_4
    move v0, v2

    .line 193
    goto :goto_0

    :cond_5
    move v0, v1

    .line 195
    goto :goto_0
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 227
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const-string v0, "GPUINFO"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 230
    const-string v1, "GPU_MODEL"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/gl/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 250
    invoke-static {p1}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 252
    const/4 v0, 0x1

    .line 254
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
