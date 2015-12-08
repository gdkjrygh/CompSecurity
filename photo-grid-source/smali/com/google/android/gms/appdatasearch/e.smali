.class public final Lcom/google/android/gms/appdatasearch/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/d",
            "<",
            "Lcom/google/android/gms/internal/th;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/appdatasearch/p;

.field private static final d:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b",
            "<",
            "Lcom/google/android/gms/internal/th;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/d;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/appdatasearch/e;->a:Lcom/google/android/gms/common/api/d;

    new-instance v0, Lcom/google/android/gms/appdatasearch/f;

    invoke-direct {v0}, Lcom/google/android/gms/appdatasearch/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/appdatasearch/e;->d:Lcom/google/android/gms/common/api/b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "AppDataSearch.LIGHTWEIGHT_API"

    sget-object v2, Lcom/google/android/gms/appdatasearch/e;->d:Lcom/google/android/gms/common/api/b;

    sget-object v3, Lcom/google/android/gms/appdatasearch/e;->a:Lcom/google/android/gms/common/api/d;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/api/d;)V

    sput-object v0, Lcom/google/android/gms/appdatasearch/e;->b:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/ti;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ti;-><init>()V

    sput-object v0, Lcom/google/android/gms/appdatasearch/e;->c:Lcom/google/android/gms/appdatasearch/p;

    return-void
.end method
