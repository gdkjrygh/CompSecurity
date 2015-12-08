.class public Lcom/mopub/common/factories/MethodBuilderFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static a:Lcom/mopub/common/factories/MethodBuilderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    new-instance v0, Lcom/mopub/common/factories/MethodBuilderFactory;

    invoke-direct {v0}, Lcom/mopub/common/factories/MethodBuilderFactory;-><init>()V

    sput-object v0, Lcom/mopub/common/factories/MethodBuilderFactory;->a:Lcom/mopub/common/factories/MethodBuilderFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;
    .locals 1

    .prologue
    .line 1018
    new-instance v0, Lcom/mopub/common/util/Reflection$MethodBuilder;

    invoke-direct {v0, p0, p1}, Lcom/mopub/common/util/Reflection$MethodBuilder;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    return-object v0
.end method

.method public static setInstance(Lcom/mopub/common/factories/MethodBuilderFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 10
    sput-object p0, Lcom/mopub/common/factories/MethodBuilderFactory;->a:Lcom/mopub/common/factories/MethodBuilderFactory;

    .line 11
    return-void
.end method
