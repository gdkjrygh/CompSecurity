.class public final Lcom/qihoo/security/appbox/bi/b$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/bi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 85
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "tp"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "pn"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string/jumbo v2, "ts"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string/jumbo v2, "rn"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/appbox/bi/b$a;->a:[Ljava/lang/String;

    return-void
.end method
