.class public final Lcom/google/android/gms/internal/xe;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/signin/internal/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/signin/internal/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b",
            "<",
            "Lcom/google/android/gms/signin/internal/n;",
            "Lcom/google/android/gms/internal/xj;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b",
            "<",
            "Lcom/google/android/gms/signin/internal/n;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/internal/xj;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lcom/google/android/gms/internal/xh;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/d;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/xe;->a:Lcom/google/android/gms/common/api/d;

    new-instance v0, Lcom/google/android/gms/common/api/d;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/xe;->b:Lcom/google/android/gms/common/api/d;

    new-instance v0, Lcom/google/android/gms/internal/xf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/xe;->c:Lcom/google/android/gms/common/api/b;

    new-instance v0, Lcom/google/android/gms/internal/xg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/xe;->d:Lcom/google/android/gms/common/api/b;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "profile"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/xe;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "email"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/xe;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "SignIn.API"

    sget-object v2, Lcom/google/android/gms/internal/xe;->c:Lcom/google/android/gms/common/api/b;

    sget-object v3, Lcom/google/android/gms/internal/xe;->a:Lcom/google/android/gms/common/api/d;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/api/d;)V

    sput-object v0, Lcom/google/android/gms/internal/xe;->g:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "SignIn.INTERNAL_API"

    sget-object v2, Lcom/google/android/gms/internal/xe;->d:Lcom/google/android/gms/common/api/b;

    sget-object v3, Lcom/google/android/gms/internal/xe;->b:Lcom/google/android/gms/common/api/d;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/api/d;)V

    sput-object v0, Lcom/google/android/gms/internal/xe;->h:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/signin/internal/m;

    invoke-direct {v0}, Lcom/google/android/gms/signin/internal/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/xe;->i:Lcom/google/android/gms/internal/xh;

    return-void
.end method
