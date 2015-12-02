.class public Lcom/facebook/common/json/c;
.super Lcom/fasterxml/jackson/core/JsonFactory;
.source "FBJsonFactory.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final a:Lcom/facebook/common/json/c;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    new-instance v0, Lcom/facebook/common/json/c;

    invoke-direct {v0}, Lcom/facebook/common/json/c;-><init>()V

    sput-object v0, Lcom/facebook/common/json/c;->a:Lcom/facebook/common/json/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    return-void
.end method
