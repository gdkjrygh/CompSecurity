.class public Lcom/facebook/user/PicCropInfo;
.super Ljava/lang/Object;
.source "PicCropInfo.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/PicCropInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "uri"
    .end annotation
.end field

.field private final b:I
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "width"
    .end annotation
.end field

.field private final c:I
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "height"
    .end annotation
.end field

.field private final d:F
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "left"
    .end annotation
.end field

.field private final e:F
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "top"
    .end annotation
.end field

.field private final f:F
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "right"
    .end annotation
.end field

.field private final g:F
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "bottom"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 141
    new-instance v0, Lcom/facebook/user/k;

    invoke-direct {v0}, Lcom/facebook/user/k;-><init>()V

    sput-object v0, Lcom/facebook/user/PicCropInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    .line 45
    iput v2, p0, Lcom/facebook/user/PicCropInfo;->b:I

    .line 46
    iput v2, p0, Lcom/facebook/user/PicCropInfo;->c:I

    .line 47
    iput v1, p0, Lcom/facebook/user/PicCropInfo;->d:F

    .line 48
    iput v1, p0, Lcom/facebook/user/PicCropInfo;->f:F

    .line 49
    iput v1, p0, Lcom/facebook/user/PicCropInfo;->e:F

    .line 50
    iput v1, p0, Lcom/facebook/user/PicCropInfo;->g:F

    .line 51
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->b:I

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->c:I

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->d:F

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->e:F

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->f:F

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/PicCropInfo;->g:F

    .line 77
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/k;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/user/PicCropInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIFFFF)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    .line 61
    iput p2, p0, Lcom/facebook/user/PicCropInfo;->b:I

    .line 62
    iput p3, p0, Lcom/facebook/user/PicCropInfo;->c:I

    .line 63
    iput p4, p0, Lcom/facebook/user/PicCropInfo;->d:F

    .line 64
    iput p5, p0, Lcom/facebook/user/PicCropInfo;->e:F

    .line 65
    iput p6, p0, Lcom/facebook/user/PicCropInfo;->f:F

    .line 66
    iput p7, p0, Lcom/facebook/user/PicCropInfo;->g:F

    .line 67
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 130
    const/16 v0, 0x64

    invoke-static {p0, v0}, Lcom/facebook/user/PicCropInfo;->a(Ljava/lang/String;I)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;I)Lcom/facebook/user/PicCropInfo;
    .locals 8

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    .line 138
    new-instance v0, Lcom/facebook/user/PicCropInfo;

    move-object v1, p0

    move v2, p1

    move v3, p1

    move v5, v4

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/user/PicCropInfo;-><init>(Ljava/lang/String;IIFFFF)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->c:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    return v0
.end method

.method public e()F
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->d:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 169
    if-ne p0, p1, :cond_1

    .line 205
    :cond_0
    :goto_0
    return v0

    .line 172
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 173
    goto :goto_0

    .line 176
    :cond_3
    check-cast p1, Lcom/facebook/user/PicCropInfo;

    .line 177
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    .line 178
    goto :goto_0

    .line 181
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->c()I

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->c()I

    move-result v3

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 182
    goto :goto_0

    .line 185
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->d()I

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->d()I

    move-result v3

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 186
    goto :goto_0

    .line 189
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->e()F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->e()F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_7

    move v0, v1

    .line 190
    goto :goto_0

    .line 193
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->f()F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->f()F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_8

    move v0, v1

    .line 194
    goto :goto_0

    .line 197
    :cond_8
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->g()F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->g()F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_9

    move v0, v1

    .line 198
    goto :goto_0

    .line 201
    :cond_9
    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->h()F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->h()F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    move v0, v1

    .line 202
    goto :goto_0
.end method

.method public f()F
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->e:F

    return v0
.end method

.method public g()F
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->f:F

    return v0
.end method

.method public h()F
    .locals 1

    .prologue
    .line 108
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->g:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 209
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->e()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->f()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->g()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->h()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 112
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->d:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->f:F

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->d:F

    iget v1, p0, Lcom/facebook/user/PicCropInfo;->f:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->f:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->e:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->g:F

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->e:F

    iget v1, p0, Lcom/facebook/user/PicCropInfo;->g:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget v0, p0, Lcom/facebook/user/PicCropInfo;->g:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Landroid/graphics/RectF;
    .locals 5

    .prologue
    .line 121
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/facebook/user/PicCropInfo;->d:F

    iget v2, p0, Lcom/facebook/user/PicCropInfo;->e:F

    iget v3, p0, Lcom/facebook/user/PicCropInfo;->f:F

    iget v4, p0, Lcom/facebook/user/PicCropInfo;->g:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PicCropInfo <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->e()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->f()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/user/PicCropInfo;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/user/PicCropInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 160
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->d:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 163
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->e:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 164
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->f:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 165
    iget v0, p0, Lcom/facebook/user/PicCropInfo;->g:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 166
    return-void
.end method
