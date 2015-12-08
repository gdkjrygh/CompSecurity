.class public final Lcom/google/android/gms/internal/nt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field a:Lcom/google/android/gms/internal/ry;

.field b:Lcom/google/android/gms/internal/ho;

.field public final c:Lcom/google/android/gms/internal/fz;

.field public final d:Lcom/google/android/gms/internal/fz;

.field private final e:Ljava/lang/Object;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/internal/rf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/rf",
            "<",
            "Lcom/google/android/gms/internal/nx;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/nt;->e:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/rf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/rf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/nt;->h:Lcom/google/android/gms/internal/rf;

    new-instance v0, Lcom/google/android/gms/internal/nu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nu;-><init>(Lcom/google/android/gms/internal/nt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nt;->c:Lcom/google/android/gms/internal/fz;

    new-instance v0, Lcom/google/android/gms/internal/nv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nv;-><init>(Lcom/google/android/gms/internal/nt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nt;->d:Lcom/google/android/gms/internal/fz;

    iput-object p2, p0, Lcom/google/android/gms/internal/nt;->g:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/nt;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/nt;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nt;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/nt;)Lcom/google/android/gms/internal/rf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nt;->h:Lcom/google/android/gms/internal/rf;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/nt;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nt;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/nt;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/nt;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/internal/nx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nt;->h:Lcom/google/android/gms/internal/rf;

    return-object v0
.end method
