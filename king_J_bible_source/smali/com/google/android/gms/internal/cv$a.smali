.class public final Lcom/google/android/gms/internal/cv$a;
.super Lcom/google/android/gms/internal/cv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/cu$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/cv;-><init>(Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/cu$a;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/cv$a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public be()V
    .locals 0

    return-void
.end method

.method public bf()Lcom/google/android/gms/internal/db;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ax;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ax;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/cv$a;->mContext:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/internal/bg;

    invoke-direct {v2}, Lcom/google/android/gms/internal/bg;-><init>()V

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/dc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ax;Lcom/google/android/gms/internal/bf;)Lcom/google/android/gms/internal/dc;

    move-result-object v0

    return-object v0
.end method
