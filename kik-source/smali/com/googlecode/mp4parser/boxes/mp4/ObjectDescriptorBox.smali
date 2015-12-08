.class public Lcom/googlecode/mp4parser/boxes/mp4/ObjectDescriptorBox;
.super Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "iods"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    const-string v0, "iods"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;-><init>(Ljava/lang/String;)V

    .line 44
    return-void
.end method
