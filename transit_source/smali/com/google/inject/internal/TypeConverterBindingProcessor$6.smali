.class Lcom/google/inject/internal/TypeConverterBindingProcessor$6;
.super Lcom/google/inject/matcher/AbstractMatcher;
.source "TypeConverterBindingProcessor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToClasses(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/matcher/AbstractMatcher",
        "<",
        "Lcom/google/inject/TypeLiteral",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/TypeConverterBindingProcessor;

.field final synthetic val$typeMatcher:Lcom/google/inject/matcher/Matcher;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;Lcom/google/inject/matcher/Matcher;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;->this$0:Lcom/google/inject/internal/TypeConverterBindingProcessor;

    iput-object p2, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;->val$typeMatcher:Lcom/google/inject/matcher/Matcher;

    invoke-direct {p0}, Lcom/google/inject/matcher/AbstractMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public matches(Lcom/google/inject/TypeLiteral;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 147
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 148
    .local v1, "type":Ljava/lang/reflect/Type;
    instance-of v2, v1, Ljava/lang/Class;

    if-nez v2, :cond_0

    .line 149
    const/4 v2, 0x0

    .line 152
    :goto_0
    return v2

    :cond_0
    move-object v0, v1

    .line 151
    check-cast v0, Ljava/lang/Class;

    .line 152
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v2, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;->val$typeMatcher:Lcom/google/inject/matcher/Matcher;

    invoke-interface {v2, v0}, Lcom/google/inject/matcher/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0
.end method

.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 145
    check-cast p1, Lcom/google/inject/TypeLiteral;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;->matches(Lcom/google/inject/TypeLiteral;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;->val$typeMatcher:Lcom/google/inject/matcher/Matcher;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
