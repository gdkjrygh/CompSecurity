.class public final Lcom/google/android/gms/gcm/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/gcm/f;

.field public static final b:Lcom/google/android/gms/gcm/f;


# instance fields
.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/gcm/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/gcm/f;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/gcm/f;->a:Lcom/google/android/gms/gcm/f;

    new-instance v0, Lcom/google/android/gms/gcm/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/gcm/f;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/gcm/f;->b:Lcom/google/android/gms/gcm/f;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/gcm/f;->c:I

    const/16 v0, 0x1e

    iput v0, p0, Lcom/google/android/gms/gcm/f;->d:I

    const/16 v0, 0xe10

    iput v0, p0, Lcom/google/android/gms/gcm/f;->e:I

    return-void
.end method
