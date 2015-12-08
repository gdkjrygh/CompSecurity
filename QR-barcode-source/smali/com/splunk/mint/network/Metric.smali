.class public abstract Lcom/splunk/mint/network/Metric;
.super Ljava/lang/Object;
.source "Metric.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/io/Serializable;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 8
    .local p0, "this":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/splunk/mint/network/Metric;->name:Ljava/lang/String;

    .line 10
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    .local p0, "this":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<TT;>;"
    iget-object v0, p0, Lcom/splunk/mint/network/Metric;->name:Ljava/lang/String;

    return-object v0
.end method

.method public abstract getValue()Ljava/io/Serializable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method
