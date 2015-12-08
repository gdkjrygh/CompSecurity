.class public final Lcom/google/android/gms/internal/bs$a;
.super Lcom/google/android/gms/internal/bs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/bs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/bs;-><init>(Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/bs$a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public ae()V
    .locals 0

    return-void
.end method

.method public af()Lcom/google/android/gms/internal/by;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bs$a;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/am;

    invoke-direct {v1}, Lcom/google/android/gms/internal/am;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/bz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;)Lcom/google/android/gms/internal/bz;

    move-result-object v0

    return-object v0
.end method
