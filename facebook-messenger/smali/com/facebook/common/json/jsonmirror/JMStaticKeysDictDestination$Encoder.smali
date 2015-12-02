.class public Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination$Encoder;
.super Ljava/lang/Object;
.source "JMStaticKeysDictDestination.java"


# static fields
.field protected static a:Lcom/fasterxml/jackson/core/JsonFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 236
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination$Encoder;->a:Lcom/fasterxml/jackson/core/JsonFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    return-void
.end method
