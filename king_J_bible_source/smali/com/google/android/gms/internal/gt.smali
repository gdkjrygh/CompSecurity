.class public Lcom/google/android/gms/internal/gt;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gt$e;,
        Lcom/google/android/gms/internal/gt$c;,
        Lcom/google/android/gms/internal/gt$d;,
        Lcom/google/android/gms/internal/gt$b;,
        Lcom/google/android/gms/internal/gt$a;
    }
.end annotation


# static fields
.field public static final Gs:Lcom/google/android/gms/internal/gt$a;

.field public static final Gt:Lcom/google/android/gms/internal/gt$b;

.field public static final Gu:Lcom/google/android/gms/internal/gt$d;

.field public static final Gv:Lcom/google/android/gms/internal/gt$c;

.field public static final Gw:Lcom/google/android/gms/internal/gt$e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const v3, 0x3e8fa0

    new-instance v0, Lcom/google/android/gms/internal/gt$a;

    const-string v1, "created"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/gt$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/gt;->Gs:Lcom/google/android/gms/internal/gt$a;

    new-instance v0, Lcom/google/android/gms/internal/gt$b;

    const-string v1, "lastOpenedTime"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/gt$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/gt;->Gt:Lcom/google/android/gms/internal/gt$b;

    new-instance v0, Lcom/google/android/gms/internal/gt$d;

    const-string v1, "modified"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/gt$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/gt;->Gu:Lcom/google/android/gms/internal/gt$d;

    new-instance v0, Lcom/google/android/gms/internal/gt$c;

    const-string v1, "modifiedByMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/gt$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/gt;->Gv:Lcom/google/android/gms/internal/gt$c;

    new-instance v0, Lcom/google/android/gms/internal/gt$e;

    const-string v1, "sharedWithMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/gt$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/gt;->Gw:Lcom/google/android/gms/internal/gt$e;

    return-void
.end method
