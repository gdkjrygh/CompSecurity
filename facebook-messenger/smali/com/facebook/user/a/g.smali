.class public final Lcom/facebook/user/a/g;
.super Ljava/lang/Object;
.source "LanguageNameFormats.java"


# static fields
.field public static final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 13
    new-instance v0, Lcom/google/common/a/fk;

    invoke-direct {v0}, Lcom/google/common/a/fk;-><init>()V

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "zh"

    aput-object v2, v1, v4

    const-string v2, "ja"

    aput-object v2, v1, v5

    const-string v2, "ko"

    aput-object v2, v1, v6

    const-string v2, "vi"

    aput-object v2, v1, v7

    const/4 v2, 0x4

    const-string v3, "hu"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "ro"

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/google/common/a/fk;->b([Ljava/lang/Object;)Lcom/google/common/a/fk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/g;->a:Lcom/google/common/a/fi;

    .line 25
    new-instance v0, Lcom/google/common/a/fk;

    invoke-direct {v0}, Lcom/google/common/a/fk;-><init>()V

    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "zh"

    aput-object v2, v1, v4

    const-string v2, "ja"

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/google/common/a/fk;->b([Ljava/lang/Object;)Lcom/google/common/a/fk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/g;->b:Lcom/google/common/a/fi;

    .line 33
    new-instance v0, Lcom/google/common/a/fk;

    invoke-direct {v0}, Lcom/google/common/a/fk;-><init>()V

    new-array v1, v7, [Ljava/lang/String;

    const-string v2, "zh"

    aput-object v2, v1, v4

    const-string v2, "ja"

    aput-object v2, v1, v5

    const-string v2, "ko"

    aput-object v2, v1, v6

    invoke-virtual {v0, v1}, Lcom/google/common/a/fk;->b([Ljava/lang/Object;)Lcom/google/common/a/fk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/g;->c:Lcom/google/common/a/fi;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
