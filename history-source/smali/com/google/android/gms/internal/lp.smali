.class public Lcom/google/android/gms/internal/lp;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/lp$e;,
        Lcom/google/android/gms/internal/lp$c;,
        Lcom/google/android/gms/internal/lp$d;,
        Lcom/google/android/gms/internal/lp$b;,
        Lcom/google/android/gms/internal/lp$a;
    }
.end annotation


# static fields
.field public static final RQ:Lcom/google/android/gms/internal/lp$a;

.field public static final RR:Lcom/google/android/gms/internal/lp$b;

.field public static final RS:Lcom/google/android/gms/internal/lp$d;

.field public static final RT:Lcom/google/android/gms/internal/lp$c;

.field public static final RU:Lcom/google/android/gms/internal/lp$e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const v3, 0x3e8fa0

    new-instance v0, Lcom/google/android/gms/internal/lp$a;

    const-string v1, "created"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/lp$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/lp;->RQ:Lcom/google/android/gms/internal/lp$a;

    new-instance v0, Lcom/google/android/gms/internal/lp$b;

    const-string v1, "lastOpenedTime"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/lp$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/lp;->RR:Lcom/google/android/gms/internal/lp$b;

    new-instance v0, Lcom/google/android/gms/internal/lp$d;

    const-string v1, "modified"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/lp$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/lp;->RS:Lcom/google/android/gms/internal/lp$d;

    new-instance v0, Lcom/google/android/gms/internal/lp$c;

    const-string v1, "modifiedByMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/lp$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/lp;->RT:Lcom/google/android/gms/internal/lp$c;

    new-instance v0, Lcom/google/android/gms/internal/lp$e;

    const-string v1, "sharedWithMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/lp$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/lp;->RU:Lcom/google/android/gms/internal/lp$e;

    return-void
.end method
