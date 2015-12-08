.class final Lezvcard/util/StringUtils$2;
.super Ljava/lang/Object;
.source "StringUtils.java"

# interfaces
.implements Lezvcard/util/StringUtils$JoinCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lezvcard/util/StringUtils;->join(Ljava/util/Map;Ljava/lang/String;Lezvcard/util/StringUtils$JoinMapCallback;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lezvcard/util/StringUtils$JoinCallback",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic val$join:Lezvcard/util/StringUtils$JoinMapCallback;


# direct methods
.method constructor <init>(Lezvcard/util/StringUtils$JoinMapCallback;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lezvcard/util/StringUtils$2;->val$join:Lezvcard/util/StringUtils$JoinMapCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic handle(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/StringBuilder;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 145
    check-cast p2, Ljava/util/Map$Entry;

    .end local p2    # "x1":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lezvcard/util/StringUtils$2;->handle(Ljava/lang/StringBuilder;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public handle(Ljava/lang/StringBuilder;Ljava/util/Map$Entry;)V
    .locals 3
    .param p1, "sb"    # Ljava/lang/StringBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 147
    .local p2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    iget-object v0, p0, Lezvcard/util/StringUtils$2;->val$join:Lezvcard/util/StringUtils$JoinMapCallback;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lezvcard/util/StringUtils$JoinMapCallback;->handle(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    return-void
.end method
