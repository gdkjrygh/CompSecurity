.class final Lcom/google/android/gms/internal/gs$1;
.super Lcom/google/android/gms/drive/metadata/internal/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/gs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/metadata/internal/h",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected synthetic b(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/gs$1;->i(Lcom/google/android/gms/common/data/DataHolder;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected i(Lcom/google/android/gms/common/data/DataHolder;II)Landroid/graphics/Bitmap;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Thumbnail field is write only"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
