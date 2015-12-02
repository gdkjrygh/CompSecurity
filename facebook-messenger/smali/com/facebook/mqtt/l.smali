.class Lcom/facebook/mqtt/l;
.super Ljava/lang/Object;
.source "MqttClient.java"


# instance fields
.field public final a:Z

.field public final b:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/mqtt/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/facebook/mqtt/b;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/b;)V
    .locals 6

    .prologue
    .line 118
    const/4 v2, 0x1

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v3

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v4

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;ZLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 123
    return-void
.end method

.method public constructor <init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;)V
    .locals 6

    .prologue
    .line 126
    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v3

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v4

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;ZLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 127
    return-void
.end method

.method public constructor <init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;B)V
    .locals 6

    .prologue
    .line 130
    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v3

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;ZLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 131
    return-void
.end method

.method public constructor <init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;Ljava/lang/Exception;)V
    .locals 6

    .prologue
    .line 134
    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v3

    invoke-static {p3}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v4

    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;ZLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 135
    return-void
.end method

.method private constructor <init>(Lcom/facebook/mqtt/b;ZLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/mqtt/a;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Exception;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Byte;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/mqtt/l;->e:Lcom/facebook/mqtt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-boolean p2, p0, Lcom/facebook/mqtt/l;->a:Z

    .line 143
    iput-object p3, p0, Lcom/facebook/mqtt/l;->b:Lcom/google/common/base/Optional;

    .line 144
    iput-object p4, p0, Lcom/facebook/mqtt/l;->c:Lcom/google/common/base/Optional;

    .line 145
    iput-object p5, p0, Lcom/facebook/mqtt/l;->d:Lcom/google/common/base/Optional;

    .line 146
    return-void
.end method
