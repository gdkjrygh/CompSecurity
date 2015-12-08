.class final Lcom/googlecode/flickrjandroid/oauth/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/googlecode/flickrjandroid/Parameter;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 1
    check-cast p1, Lcom/googlecode/flickrjandroid/Parameter;

    check-cast p2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 1135
    instance-of v0, p1, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-nez v0, :cond_1

    .line 1136
    const/4 v0, 0x1

    .line 1139
    :cond_0
    :goto_0
    return v0

    .line 1138
    :cond_1
    instance-of v0, p2, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-nez v0, :cond_2

    .line 1139
    const/4 v0, -0x1

    goto :goto_0

    .line 1142
    :cond_2
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 1143
    if-nez v0, :cond_0

    .line 1144
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method
