.class public final Lcom/google/android/gms/internal/is;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/drive/metadata/b;

.field public static final b:Lcom/google/android/gms/drive/metadata/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/d;

    const-string v1, "contentAvailability"

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/drive/metadata/b;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/a;

    const-string v1, "isPinnable"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/is;->b:Lcom/google/android/gms/drive/metadata/b;

    return-void
.end method
