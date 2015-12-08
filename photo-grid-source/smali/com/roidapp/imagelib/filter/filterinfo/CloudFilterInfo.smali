.class public Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    new-instance v0, Lcom/roidapp/imagelib/filter/filterinfo/a;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/filterinfo/a;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    return v0
.end method

.method public final a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/roidapp/imagelib/filter/r;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->e:Ljava/lang/String;

    const-string v2, "drawable"

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 85
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 87
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 99
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/roidapp/imagelib/filter/r;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object v1

    .line 101
    if-nez v1, :cond_0

    .line 109
    :goto_0
    return-object v0

    .line 104
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 106
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 124
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 62
    return-void
.end method
