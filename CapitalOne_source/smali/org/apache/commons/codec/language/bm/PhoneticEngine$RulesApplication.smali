.class final Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;
.super Ljava/lang/Object;
.source "PhoneticEngine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/codec/language/bm/PhoneticEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RulesApplication"
.end annotation


# instance fields
.field private final finalRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/codec/language/bm/Rule;",
            ">;"
        }
    .end annotation
.end field

.field private found:Z

.field private i:I

.field private final input:Ljava/lang/CharSequence;

.field private maxPhonemes:I

.field private phonemeBuilder:Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/CharSequence;Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;II)V
    .locals 2
    .param p2, "input"    # Ljava/lang/CharSequence;
    .param p3, "phonemeBuilder"    # Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;
    .param p4, "i"    # I
    .param p5, "maxPhonemes"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/codec/language/bm/Rule;",
            ">;",
            "Ljava/lang/CharSequence;",
            "Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;",
            "II)V"
        }
    .end annotation

    .prologue
    .line 175
    .local p1, "finalRules":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    if-nez p1, :cond_0

    .line 177
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "The finalRules argument must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_0
    iput-object p1, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->finalRules:Ljava/util/List;

    .line 180
    iput-object p3, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->phonemeBuilder:Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;

    .line 181
    iput-object p2, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->input:Ljava/lang/CharSequence;

    .line 182
    iput p4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->i:I

    .line 183
    iput p5, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->maxPhonemes:I

    .line 184
    return-void
.end method


# virtual methods
.method public getI()I
    .locals 1

    .prologue
    .line 187
    iget v0, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->i:I

    return v0
.end method

.method public getPhonemeBuilder()Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->phonemeBuilder:Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;

    return-object v0
.end method

.method public invoke()Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;
    .locals 7

    .prologue
    .line 202
    const/4 v4, 0x0

    iput-boolean v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->found:Z

    .line 203
    const/4 v2, 0x0

    .line 204
    .local v2, "patternLength":I
    iget-object v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->finalRules:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/codec/language/bm/Rule;

    .line 205
    .local v3, "rule":Lorg/apache/commons/codec/language/bm/Rule;
    invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/Rule;->getPattern()Ljava/lang/String;

    move-result-object v1

    .line 206
    .local v1, "pattern":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 208
    iget-object v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->input:Ljava/lang/CharSequence;

    iget v5, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->i:I

    invoke-virtual {v3, v4, v5}, Lorg/apache/commons/codec/language/bm/Rule;->patternAndContextMatches(Ljava/lang/CharSequence;I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 212
    iget-object v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->phonemeBuilder:Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;

    invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/Rule;->getPhoneme()Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr;

    move-result-object v5

    iget v6, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->maxPhonemes:I

    invoke-virtual {v4, v5, v6}, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;->apply(Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr;I)Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;

    move-result-object v4

    iput-object v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->phonemeBuilder:Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;

    .line 213
    const/4 v4, 0x1

    iput-boolean v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->found:Z

    .line 217
    .end local v1    # "pattern":Ljava/lang/String;
    .end local v3    # "rule":Lorg/apache/commons/codec/language/bm/Rule;
    :cond_1
    iget-boolean v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->found:Z

    if-nez v4, :cond_2

    .line 218
    const/4 v2, 0x1

    .line 221
    :cond_2
    iget v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->i:I

    add-int/2addr v4, v2

    iput v4, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->i:I

    .line 222
    return-object p0
.end method

.method public isFound()Z
    .locals 1

    .prologue
    .line 226
    iget-boolean v0, p0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$RulesApplication;->found:Z

    return v0
.end method
