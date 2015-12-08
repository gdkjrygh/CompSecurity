.class public abstract Lcom/google/android/gms/internal/dg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/dg;
    .annotation runtime Lcom/google/android/gms/internal/nh;
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/internal/dg;
    .annotation runtime Lcom/google/android/gms/internal/nh;
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/internal/dg;
    .annotation runtime Lcom/google/android/gms/internal/nh;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/dh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/dh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/dg;->a:Lcom/google/android/gms/internal/dg;

    new-instance v0, Lcom/google/android/gms/internal/di;

    invoke-direct {v0}, Lcom/google/android/gms/internal/di;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/dg;->b:Lcom/google/android/gms/internal/dg;

    new-instance v0, Lcom/google/android/gms/internal/dj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/dj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/dg;->c:Lcom/google/android/gms/internal/dg;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
