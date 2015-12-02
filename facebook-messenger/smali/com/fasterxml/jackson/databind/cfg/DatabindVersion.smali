.class public Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;
.super Lcom/fasterxml/jackson/core/util/VersionUtil;
.source "DatabindVersion.java"


# static fields
.field public static final instance:Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;->instance:Lcom/fasterxml/jackson/databind/cfg/DatabindVersion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/util/VersionUtil;-><init>()V

    return-void
.end method
