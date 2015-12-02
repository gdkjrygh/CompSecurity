.class public final Lcom/fasterxml/jackson/datatype/guava/PackageVersion;
.super Ljava/lang/Object;
.source "PackageVersion.java"


# static fields
.field public static final VERSION:Lcom/fasterxml/jackson/core/Version;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 7
    const-string v0, "2.0.4-SNAPSHOT"

    const-string v1, "com.fasterxml.jackson.datatype"

    const-string v2, "jackson-datatype-guava"

    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/util/VersionUtil;->parseVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/datatype/guava/PackageVersion;->VERSION:Lcom/fasterxml/jackson/core/Version;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
