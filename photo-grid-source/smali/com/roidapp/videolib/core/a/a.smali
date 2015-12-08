.class public final Lcom/roidapp/videolib/core/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Lcom/roidapp/videolib/b/u;

.field private B:[Lcom/roidapp/videolib/b/u;

.field private C:I

.field private D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field public a:I

.field public b:I

.field public c:F

.field public d:F

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:Ljava/lang/String;

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:Z

.field public q:I

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:[Ljava/lang/String;

.field private u:I

.field private v:I

.field private w:J

.field private x:J

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/core/a/a;->e:I

    .line 70
    iput v1, p0, Lcom/roidapp/videolib/core/a/a;->k:F

    .line 71
    iput v1, p0, Lcom/roidapp/videolib/core/a/a;->l:F

    .line 320
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;IIJJIZ)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/core/a/a;->e:I

    .line 70
    iput v1, p0, Lcom/roidapp/videolib/core/a/a;->k:F

    .line 71
    iput v1, p0, Lcom/roidapp/videolib/core/a/a;->l:F

    .line 320
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 88
    iput-object p1, p0, Lcom/roidapp/videolib/core/a/a;->r:Ljava/lang/String;

    .line 89
    iput-object p2, p0, Lcom/roidapp/videolib/core/a/a;->s:Ljava/lang/String;

    .line 90
    iput-object p3, p0, Lcom/roidapp/videolib/core/a/a;->t:[Ljava/lang/String;

    .line 91
    iput p4, p0, Lcom/roidapp/videolib/core/a/a;->u:I

    .line 92
    iput p5, p0, Lcom/roidapp/videolib/core/a/a;->v:I

    .line 93
    iput-wide p6, p0, Lcom/roidapp/videolib/core/a/a;->w:J

    .line 94
    iput-wide p8, p0, Lcom/roidapp/videolib/core/a/a;->x:J

    .line 95
    iput p10, p0, Lcom/roidapp/videolib/core/a/a;->y:I

    .line 96
    iput-boolean p11, p0, Lcom/roidapp/videolib/core/a/a;->z:Z

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/videolib/core/a/a;->n:Z

    .line 98
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lcom/roidapp/videolib/core/a/a;
    .locals 6

    .prologue
    .line 223
    new-instance v1, Lcom/roidapp/videolib/core/a/a;

    invoke-direct {v1}, Lcom/roidapp/videolib/core/a/a;-><init>()V

    .line 225
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 226
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 227
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 229
    const-string v0, "op"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->r:Ljava/lang/String;

    .line 230
    const-string v0, "afp"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->s:Ljava/lang/String;

    .line 231
    const-string v0, "fi"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->t:[Ljava/lang/String;

    .line 232
    const-string v0, "w"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->u:I

    .line 233
    const-string v0, "h"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->v:I

    .line 234
    const-string v0, "asm"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/roidapp/videolib/core/a/a;->w:J

    .line 235
    const-string v0, "tm"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/roidapp/videolib/core/a/a;->x:J

    .line 236
    const-string v0, "quality"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->y:I

    .line 238
    const-string v0, "width"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->a:I

    .line 239
    const-string v0, "height"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->b:I

    .line 240
    const-string v0, "scale"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->c:F

    .line 241
    const-string v0, "corner_scale"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->d:F

    .line 242
    const-string v0, "mShapeIndex"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->e:I

    .line 243
    const-string v0, "mPosition"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->f:I

    .line 244
    const-string v0, "mPattenIndex0"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->g:I

    .line 245
    const-string v0, "mPattenIndex1"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->h:I

    .line 246
    const-string v0, "top_border"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->i:F

    .line 247
    const-string v0, "left_border"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->j:F

    .line 248
    const-string v0, "corner_radious"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->k:F

    .line 249
    const-string v0, "outer_space"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->l:F

    .line 250
    const-string v0, "is_fit"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roidapp/videolib/core/a/a;->z:Z

    .line 251
    const-string v0, "cover_path"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->m:Ljava/lang/String;

    .line 252
    const-string v0, "water_mark"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roidapp/videolib/core/a/a;->n:Z

    .line 254
    const-string v0, "video_water_marker"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->o:Ljava/lang/String;

    .line 255
    const-string v0, "transitionConfig"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/b/u;

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->A:Lcom/roidapp/videolib/b/u;

    .line 256
    const-string v0, "video_alphaprogress"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->C:I

    .line 257
    const-string v0, "video_filter_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 258
    const-string v0, "video_bg_blur"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roidapp/videolib/core/a/a;->p:Z

    .line 259
    const-string v0, "video_bg_blur_size"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v1, Lcom/roidapp/videolib/core/a/a;->q:I

    .line 261
    const-string v0, "transitionArrayConfig"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    .line 262
    if-eqz v2, :cond_0

    .line 263
    array-length v0, v2

    new-array v0, v0, [Lcom/roidapp/videolib/b/u;

    iput-object v0, v1, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    .line 264
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_0

    .line 265
    iget-object v3, v1, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v4

    aget v5, v2, v0

    aget-object v4, v4, v5

    aput-object v4, v3, v0

    .line 264
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 269
    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 323
    iput p1, p0, Lcom/roidapp/videolib/core/a/a;->C:I

    .line 324
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 0

    .prologue
    .line 331
    iput-object p1, p0, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 332
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/b/u;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/roidapp/videolib/core/a/a;->A:Lcom/roidapp/videolib/b/u;

    .line 315
    return-void
.end method

.method public final a([Lcom/roidapp/videolib/b/u;)V
    .locals 0

    .prologue
    .line 306
    iput-object p1, p0, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    .line 307
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final c()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->t:[Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 141
    iget v0, p0, Lcom/roidapp/videolib/core/a/a;->u:I

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lcom/roidapp/videolib/core/a/a;->v:I

    return v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 149
    iget-wide v0, p0, Lcom/roidapp/videolib/core/a/a;->w:J

    return-wide v0
.end method

.method public final g()J
    .locals 2

    .prologue
    .line 153
    iget-wide v0, p0, Lcom/roidapp/videolib/core/a/a;->x:J

    return-wide v0
.end method

.method public final h()I
    .locals 1

    .prologue
    .line 157
    iget v0, p0, Lcom/roidapp/videolib/core/a/a;->y:I

    return v0
.end method

.method public final i()Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 162
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 164
    const-string v0, "op"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->r:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "afp"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->s:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "fi"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->t:[Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 167
    const-string v0, "w"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->u:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 168
    const-string v0, "h"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->v:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 169
    const-string v0, "asm"

    iget-wide v2, p0, Lcom/roidapp/videolib/core/a/a;->w:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 170
    const-string v0, "tm"

    iget-wide v2, p0, Lcom/roidapp/videolib/core/a/a;->x:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 171
    const-string v0, "quality"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->y:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 173
    const-string v0, "width"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->a:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 174
    const-string v0, "height"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->b:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 175
    const-string v0, "scale"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->c:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 176
    const-string v0, "corner_scale"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->d:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 177
    const-string v0, "mShapeIndex"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->e:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 178
    const-string v0, "mPosition"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->f:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 179
    const-string v0, "mPattenIndex0"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->g:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 180
    const-string v0, "mPattenIndex1"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->h:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 181
    const-string v0, "top_border"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->i:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 182
    const-string v0, "left_border"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->j:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 183
    const-string v0, "corner_radious"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->k:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 184
    const-string v0, "outer_space"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->l:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 185
    const-string v0, "is_fit"

    iget-boolean v2, p0, Lcom/roidapp/videolib/core/a/a;->z:Z

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 187
    const-string v0, "cover_path"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->m:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v0, "water_mark"

    iget-boolean v2, p0, Lcom/roidapp/videolib/core/a/a;->n:Z

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 191
    const-string v0, "video_water_marker"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->o:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "transitionConfig"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->A:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 193
    const-string v0, "video_alphaprogress"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->C:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 194
    const-string v0, "video_bg_blur"

    iget-boolean v2, p0, Lcom/roidapp/videolib/core/a/a;->p:Z

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 195
    const-string v0, "video_bg_blur_size"

    iget v2, p0, Lcom/roidapp/videolib/core/a/a;->q:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 206
    const-string v0, "video_filter_type"

    iget-object v2, p0, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 207
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 208
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 209
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 211
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    array-length v0, v0

    new-array v2, v0, [I

    .line 213
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_0

    .line 214
    iget-object v3, p0, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v3

    aput v3, v2, v0

    .line 213
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 216
    :cond_0
    const-string v0, "transitionArrayConfig"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 219
    :cond_1
    return-object v1
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 273
    iget-boolean v0, p0, Lcom/roidapp/videolib/core/a/a;->z:Z

    return v0
.end method

.method public final k()[Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->B:[Lcom/roidapp/videolib/b/u;

    return-object v0
.end method

.method public final l()Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->A:Lcom/roidapp/videolib/b/u;

    return-object v0
.end method

.method public final m()I
    .locals 1

    .prologue
    .line 327
    iget v0, p0, Lcom/roidapp/videolib/core/a/a;->C:I

    return v0
.end method

.method public final n()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/roidapp/videolib/core/a/a;->D:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    return-object v0
.end method
