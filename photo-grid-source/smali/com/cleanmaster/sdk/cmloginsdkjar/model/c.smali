.class final Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/ParameterizedType;


# instance fields
.field final synthetic a:Ljava/lang/Class;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 571
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;->a:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getActualTypeArguments()[Ljava/lang/reflect/Type;
    .locals 3

    .prologue
    .line 574
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;->a:Ljava/lang/Class;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final getOwnerType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 579
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRawType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 584
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    return-object v0
.end method
