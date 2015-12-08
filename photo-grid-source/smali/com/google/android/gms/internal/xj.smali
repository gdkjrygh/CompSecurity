.class public final Lcom/google/android/gms/internal/xj;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/internal/xj;


# instance fields
.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/common/api/m;

.field private final f:Z

.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/xk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xk;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/xk;->a()Lcom/google/android/gms/internal/xj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/xj;->a:Lcom/google/android/gms/internal/xj;

    return-void
.end method

.method private constructor <init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/m;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/xj;->b:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/xj;->c:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/xj;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/xj;->e:Lcom/google/android/gms/common/api/m;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/xj;->f:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/xj;->g:Z

    return-void
.end method

.method synthetic constructor <init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/m;ZZB)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/xj;-><init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/m;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xj;->b:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xj;->c:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/xj;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/common/api/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/xj;->e:Lcom/google/android/gms/common/api/m;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xj;->f:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xj;->g:Z

    return v0
.end method
