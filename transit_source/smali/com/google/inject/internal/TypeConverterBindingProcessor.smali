.class final Lcom/google/inject/internal/TypeConverterBindingProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "TypeConverterBindingProcessor.java"


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 41
    return-void
.end method

.method private convertToClass(Ljava/lang/Class;Lcom/google/inject/spi/TypeConverter;)V
    .locals 1
    .param p2, "converter"    # Lcom/google/inject/spi/TypeConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lcom/google/inject/spi/TypeConverter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 140
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-static {p1}, Lcom/google/inject/matcher/Matchers;->identicalTo(Ljava/lang/Object;)Lcom/google/inject/matcher/Matcher;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToClasses(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    .line 141
    return-void
.end method

.method private convertToClasses(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
    .locals 1
    .param p2, "converter"    # Lcom/google/inject/spi/TypeConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-",
            "Ljava/lang/Class",
            "<*>;>;",
            "Lcom/google/inject/spi/TypeConverter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 145
    .local p1, "typeMatcher":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-Ljava/lang/Class<*>;>;"
    new-instance v0, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/TypeConverterBindingProcessor$6;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;Lcom/google/inject/matcher/Matcher;)V

    invoke-direct {p0, v0, p2}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->internalConvertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    .line 159
    return-void
.end method

.method private convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 113
    .local p1, "primitiveType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "wrapperType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parse"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/internal/util/$Strings;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {p2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 116
    .local v1, "parser":Ljava/lang/reflect/Method;
    new-instance v2, Lcom/google/inject/internal/TypeConverterBindingProcessor$5;

    invoke-direct {v2, p0, v1, p2}, Lcom/google/inject/internal/TypeConverterBindingProcessor$5;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 133
    .local v2, "typeConverter":Lcom/google/inject/spi/TypeConverter;
    invoke-direct {p0, p2, v2}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToClass(Ljava/lang/Class;Lcom/google/inject/spi/TypeConverter;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    return-void

    .line 134
    .end local v1    # "parser":Ljava/lang/reflect/Method;
    .end local v2    # "typeConverter":Lcom/google/inject/spi/TypeConverter;
    :catch_0
    move-exception v0

    .line 135
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
.end method

.method private internalConvertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
    .locals 3
    .param p2, "converter"    # Lcom/google/inject/spi/TypeConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-",
            "Lcom/google/inject/TypeLiteral",
            "<*>;>;",
            "Lcom/google/inject/spi/TypeConverter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 163
    .local p1, "typeMatcher":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-Lcom/google/inject/TypeLiteral<*>;>;"
    iget-object v0, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v0, v0, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    new-instance v1, Lcom/google/inject/spi/TypeConverterBinding;

    sget-object v2, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    invoke-direct {v1, v2, p1, p2}, Lcom/google/inject/spi/TypeConverterBinding;-><init>(Ljava/lang/Object;Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    invoke-interface {v0, v1}, Lcom/google/inject/internal/State;->addConverter(Lcom/google/inject/spi/TypeConverterBinding;)V

    .line 165
    return-void
.end method


# virtual methods
.method prepareBuiltInConverters(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 3
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    const/4 v2, 0x0

    .line 45
    iput-object p1, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 48
    :try_start_0
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Integer;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 49
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Long;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 50
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 51
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Byte;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 52
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Short;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 53
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Float;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 54
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Double;

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToPrimitiveType(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 56
    const-class v0, Ljava/lang/Character;

    new-instance v1, Lcom/google/inject/internal/TypeConverterBindingProcessor$1;

    invoke-direct {v1, p0}, Lcom/google/inject/internal/TypeConverterBindingProcessor$1;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;)V

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToClass(Ljava/lang/Class;Lcom/google/inject/spi/TypeConverter;)V

    .line 70
    const-class v0, Ljava/lang/Enum;

    invoke-static {v0}, Lcom/google/inject/matcher/Matchers;->subclassesOf(Ljava/lang/Class;)Lcom/google/inject/matcher/Matcher;

    move-result-object v0

    new-instance v1, Lcom/google/inject/internal/TypeConverterBindingProcessor$2;

    invoke-direct {v1, p0}, Lcom/google/inject/internal/TypeConverterBindingProcessor$2;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;)V

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->convertToClasses(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    .line 81
    new-instance v0, Lcom/google/inject/internal/TypeConverterBindingProcessor$3;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/TypeConverterBindingProcessor$3;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;)V

    new-instance v1, Lcom/google/inject/internal/TypeConverterBindingProcessor$4;

    invoke-direct {v1, p0}, Lcom/google/inject/internal/TypeConverterBindingProcessor$4;-><init>(Lcom/google/inject/internal/TypeConverterBindingProcessor;)V

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->internalConvertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    iput-object v2, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 109
    return-void

    .line 107
    :catchall_0
    move-exception v0

    iput-object v2, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    throw v0
.end method

.method public visit(Lcom/google/inject/spi/TypeConverterBinding;)Ljava/lang/Boolean;
    .locals 5
    .param p1, "command"    # Lcom/google/inject/spi/TypeConverterBinding;

    .prologue
    .line 168
    iget-object v0, p0, Lcom/google/inject/internal/TypeConverterBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v0, v0, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    new-instance v1, Lcom/google/inject/spi/TypeConverterBinding;

    invoke-virtual {p1}, Lcom/google/inject/spi/TypeConverterBinding;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/inject/spi/TypeConverterBinding;->getTypeMatcher()Lcom/google/inject/matcher/Matcher;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/inject/spi/TypeConverterBinding;->getTypeConverter()Lcom/google/inject/spi/TypeConverter;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/inject/spi/TypeConverterBinding;-><init>(Ljava/lang/Object;Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    invoke-interface {v0, v1}, Lcom/google/inject/internal/State;->addConverter(Lcom/google/inject/spi/TypeConverterBinding;)V

    .line 170
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/TypeConverterBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/TypeConverterBinding;

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->visit(Lcom/google/inject/spi/TypeConverterBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
