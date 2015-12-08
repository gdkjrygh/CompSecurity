.class public final Lcom/google/android/gms/internal/ip;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/drive/metadata/c;

.field public static final b:Lcom/google/android/gms/drive/metadata/c;

.field public static final c:Lcom/google/android/gms/drive/metadata/c;

.field public static final d:Lcom/google/android/gms/drive/metadata/c;

.field public static final e:Lcom/google/android/gms/drive/metadata/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v2, 0x3e8fa0

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "modified"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ip;->a:Lcom/google/android/gms/drive/metadata/c;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "modifiedByMe"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ip;->b:Lcom/google/android/gms/drive/metadata/c;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "created"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ip;->c:Lcom/google/android/gms/drive/metadata/c;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "sharedWithMe"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ip;->d:Lcom/google/android/gms/drive/metadata/c;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/b;

    const-string v1, "lastOpenedTime"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ip;->e:Lcom/google/android/gms/drive/metadata/c;

    return-void
.end method
