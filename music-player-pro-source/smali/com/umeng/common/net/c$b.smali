.class Lcom/umeng/common/net/c$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/common/net/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/umeng/common/net/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/umeng/common/net/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/common/net/c;-><init>(Lcom/umeng/common/net/c;)V

    sput-object v0, Lcom/umeng/common/net/c$b;->a:Lcom/umeng/common/net/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
