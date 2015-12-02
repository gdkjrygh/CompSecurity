.class public final Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;
.super Ljava/lang/Object;
.source "SmileGenerator.java"


# instance fields
.field public final index:I

.field public next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

.field public final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;)V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    .line 126
    iput p2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    .line 127
    iput-object p3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 128
    return-void
.end method
