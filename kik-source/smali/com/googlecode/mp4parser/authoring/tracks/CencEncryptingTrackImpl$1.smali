.class Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl;

    .line 74
    invoke-direct {p0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;

    check-cast p2, [J

    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptingTrackImpl$1;->put(Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;[J)[J

    move-result-object v0

    return-object v0
.end method

.method public put(Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;[J)[J
    .locals 2

    .prologue
    .line 77
    instance-of v0, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/CencSampleEncryptionInformationGroupEntry;

    if-eqz v0, :cond_0

    .line 78
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Please supply CencSampleEncryptionInformationGroupEntries in the constructor"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method
