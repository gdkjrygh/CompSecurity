.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;
.super Ljava/lang/Object;
.source "360Security"


# virtual methods
.method public abstract cancelClear()V
.end method

.method public abstract cancelScan(Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;)V
.end method

.method public abstract clearByTrashInfo(Ljava/util/List;Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;",
            ")I"
        }
    .end annotation
.end method

.method public abstract destroy()V
.end method

.method public abstract scan(I[ILjava/util/List;Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;",
            ")I"
        }
    .end annotation
.end method

.method public abstract setOption(Ljava/lang/String;Ljava/lang/String;)V
.end method
