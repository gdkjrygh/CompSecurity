.class public abstract Lezvcard/io/scribe/VCardPropertyScribe;
.super Ljava/lang/Object;
.source "VCardPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/VCardPropertyScribe$4;,
        Lezvcard/io/scribe/VCardPropertyScribe$Result;,
        Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;,
        Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;,
        Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;,
        Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/VCardProperty;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected final propertyName:Ljava/lang/String;

.field protected final qname:Ljavax/xml/namespace/QName;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 3
    .param p2, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 77
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    new-instance v0, Ljavax/xml/namespace/QName;

    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {v1}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljavax/xml/namespace/QName;)V

    .line 78
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljavax/xml/namespace/QName;)V
    .locals 0
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "qname"    # Ljavax/xml/namespace/QName;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Ljavax/xml/namespace/QName;",
            ")V"
        }
    .end annotation

    .prologue
    .line 88
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lezvcard/io/scribe/VCardPropertyScribe;->clazz:Ljava/lang/Class;

    .line 90
    iput-object p2, p0, Lezvcard/io/scribe/VCardPropertyScribe;->propertyName:Ljava/lang/String;

    .line 91
    iput-object p3, p0, Lezvcard/io/scribe/VCardPropertyScribe;->qname:Ljavax/xml/namespace/QName;

    .line 92
    return-void
.end method

.method protected static date(Ljava/util/Date;)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;

    .prologue
    .line 975
    new-instance v0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    invoke-direct {v0, p0}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;-><init>(Ljava/util/Date;)V

    return-object v0
.end method

.method protected static date(Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 966
    invoke-static {p0}, Lezvcard/util/VCardDateFormatter;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static escape(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 646
    if-nez p0, :cond_1

    .line 647
    const/4 p0, 0x0

    .line 666
    .end local p0    # "text":Ljava/lang/String;
    .local v1, "chars":Ljava/lang/String;
    .local v2, "i":I
    .local v3, "sb":Ljava/lang/StringBuilder;
    :cond_0
    :goto_0
    return-object p0

    .line 650
    .end local v1    # "chars":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .restart local p0    # "text":Ljava/lang/String;
    :cond_1
    const-string v1, "\\,;"

    .line 651
    .restart local v1    # "chars":Ljava/lang/String;
    const/4 v3, 0x0

    .line 652
    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_5

    .line 653
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 654
    .local v0, "ch":C
    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_3

    .line 655
    if-nez v3, :cond_2

    .line 656
    new-instance v3, Ljava/lang/StringBuilder;

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 657
    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    const/4 v4, 0x0

    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    :cond_2
    const/16 v4, 0x5c

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 662
    :cond_3
    if-eqz v3, :cond_4

    .line 663
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 652
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 666
    .end local v0    # "ch":C
    :cond_5
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method protected static handlePrefParam(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 7
    .param p0, "property"    # Lezvcard/property/VCardProperty;
    .param p1, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 1111
    sget-object v5, Lezvcard/io/scribe/VCardPropertyScribe$4;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 1144
    :cond_0
    :goto_0
    return-void

    .line 1114
    :pswitch_0
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lezvcard/parameter/VCardParameters;->setPref(Ljava/lang/Integer;)V

    .line 1117
    const/4 v1, 0x0

    .line 1118
    .local v1, "mostPreferred":Lezvcard/property/VCardProperty;
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p3, v5}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/property/VCardProperty;

    .line 1119
    .local v2, "p":Lezvcard/property/VCardProperty;
    invoke-virtual {v2}, Lezvcard/property/VCardProperty;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v5

    invoke-virtual {v5}, Lezvcard/parameter/VCardParameters;->getPref()Ljava/lang/Integer;

    move-result-object v3

    .line 1120
    .local v3, "pref":Ljava/lang/Integer;
    if-eqz v3, :cond_1

    .line 1124
    if-eqz v1, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v1}, Lezvcard/property/VCardProperty;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/parameter/VCardParameters;->getPref()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 1125
    :cond_2
    move-object v1, v2

    goto :goto_1

    .line 1129
    .end local v2    # "p":Lezvcard/property/VCardProperty;
    .end local v3    # "pref":Ljava/lang/Integer;
    :cond_3
    if-ne p0, v1, :cond_0

    .line 1130
    const-string v5, "pref"

    invoke-virtual {p1, v5}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    goto :goto_0

    .line 1135
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "mostPreferred":Lezvcard/property/VCardProperty;
    :pswitch_1
    invoke-virtual {p0}, Lezvcard/property/VCardProperty;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v5

    invoke-virtual {v5}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1136
    .local v4, "type":Ljava/lang/String;
    const-string v5, "pref"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1137
    invoke-virtual {p1, v4}, Lezvcard/parameter/VCardParameters;->removeType(Ljava/lang/String;)V

    .line 1138
    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v5}, Lezvcard/parameter/VCardParameters;->setPref(Ljava/lang/Integer;)V

    goto :goto_0

    .line 1111
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static jcardValueToString(Lezvcard/io/json/JCardValue;)Ljava/lang/String;
    .locals 4
    .param p0, "value"    # Lezvcard/io/json/JCardValue;

    .prologue
    .line 565
    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    .line 566
    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->asMulti()Ljava/util/List;

    move-result-object v0

    .line 567
    .local v0, "multi":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 568
    invoke-static {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->list(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v2

    .line 579
    .end local v0    # "multi":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_0
    return-object v2

    .line 572
    :cond_0
    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/io/json/JsonValue;

    invoke-virtual {v2}, Lezvcard/io/json/JsonValue;->getArray()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 573
    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->asStructured()Ljava/util/List;

    move-result-object v1

    .line 574
    .local v1, "structured":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 575
    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 579
    .end local v1    # "structured":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    :cond_1
    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method protected static list(Ljava/util/Collection;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 781
    .local p0, "values":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    const-string v0, ","

    new-instance v1, Lezvcard/io/scribe/VCardPropertyScribe$1;

    invoke-direct {v1}, Lezvcard/io/scribe/VCardPropertyScribe$1;-><init>()V

    invoke-static {p0, v0, v1}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Lezvcard/util/StringUtils$JoinCallback;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static varargs list([Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0, "values"    # [Ljava/lang/Object;

    .prologue
    .line 772
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->list(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static list(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p0, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 760
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 761
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 763
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ","

    invoke-static {p0, v0}, Lezvcard/io/scribe/VCardPropertyScribe;->split(Ljava/lang/String;Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->unescape(Z)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->split()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method protected static varargs missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;
    .locals 4
    .param p0, "dataTypes"    # [Lezvcard/VCardDataType;

    .prologue
    .line 1056
    array-length v3, p0

    new-array v1, v3, [Ljava/lang/String;

    .line 1057
    .local v1, "elements":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    .line 1058
    aget-object v0, p0, v2

    .line 1059
    .local v0, "dataType":Lezvcard/VCardDataType;
    if-nez v0, :cond_0

    const-string v3, "unknown"

    :goto_1
    aput-object v3, v1, v2

    .line 1057
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1059
    :cond_0
    invoke-virtual {v0}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1061
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_1
    invoke-static {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->missingXmlElements([Ljava/lang/String;)Lezvcard/io/CannotParseException;

    move-result-object v3

    return-object v3
.end method

.method protected static varargs missingXmlElements([Ljava/lang/String;)Lezvcard/io/CannotParseException;
    .locals 5
    .param p0, "elements"    # [Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 1073
    array-length v2, p0

    packed-switch v2, :pswitch_data_0

    .line 1084
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1086
    .local v1, "sb":Ljava/lang/StringBuilder;
    const-string v2, "Property value empty (no "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    array-length v3, p0

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    const-string v3, ", "

    new-instance v4, Lezvcard/io/scribe/VCardPropertyScribe$3;

    invoke-direct {v4}, Lezvcard/io/scribe/VCardPropertyScribe$3;-><init>()V

    invoke-static {v2, v3, v1, v4}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;Lezvcard/util/StringUtils$JoinCallback;)V

    .line 1092
    const-string v2, ", or <"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p0

    add-int/lit8 v3, v3, -0x1

    aget-object v3, p0, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "> elements found)."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1098
    .end local v1    # "sb":Ljava/lang/StringBuilder;
    .local v0, "message":Ljava/lang/String;
    :goto_0
    new-instance v2, Lezvcard/io/CannotParseException;

    invoke-direct {v2, v0}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    return-object v2

    .line 1075
    .end local v0    # "message":Ljava/lang/String;
    :pswitch_0
    const-string v0, "Property value empty."

    .line 1076
    .restart local v0    # "message":Ljava/lang/String;
    goto :goto_0

    .line 1078
    .end local v0    # "message":Ljava/lang/String;
    :pswitch_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Property value empty (no <"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, p0, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "> element found)."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1079
    .restart local v0    # "message":Ljava/lang/String;
    goto :goto_0

    .line 1081
    .end local v0    # "message":Ljava/lang/String;
    :pswitch_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Property value empty (no <"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, p0, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "> or <"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v3, p0, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "> elements found)."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1082
    .restart local v0    # "message":Ljava/lang/String;
    goto :goto_0

    .line 1073
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected static semistructured(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 799
    const/4 v0, -0x1

    invoke-static {p0, v0}, Lezvcard/io/scribe/VCardPropertyScribe;->semistructured(Ljava/lang/String;I)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;

    move-result-object v0

    return-object v0
.end method

.method protected static semistructured(Ljava/lang/String;I)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
    .locals 3
    .param p0, "value"    # Ljava/lang/String;
    .param p1, "limit"    # I

    .prologue
    .line 811
    const-string v1, ";"

    invoke-static {p0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->split(Ljava/lang/String;Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->unescape(Z)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->limit(I)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->split()Ljava/util/List;

    move-result-object v0

    .line 812
    .local v0, "split":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method protected static split(Ljava/lang/String;Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
    .locals 1
    .param p0, "string"    # Ljava/lang/String;
    .param p1, "delimiter"    # Ljava/lang/String;

    .prologue
    .line 676
    new-instance v0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    invoke-direct {v0, p0, p1}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method protected static structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    .locals 2
    .param p0, "value"    # Lezvcard/io/json/JCardValue;

    .prologue
    .line 835
    new-instance v0, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    invoke-virtual {p0}, Lezvcard/io/json/JCardValue;->asStructured()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method protected static structured(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    .locals 6
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 821
    const-string v4, ";"

    invoke-static {p0, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->split(Ljava/lang/String;Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;

    move-result-object v4

    invoke-virtual {v4}, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->split()Ljava/util/List;

    move-result-object v3

    .line 822
    .local v3, "split":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 823
    .local v0, "components":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 824
    .local v2, "s":Ljava/lang/String;
    invoke-static {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 826
    .end local v2    # "s":Ljava/lang/String;
    :cond_0
    new-instance v4, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-direct {v4, v5}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;-><init>(Ljava/util/Iterator;)V

    return-object v4
.end method

.method protected static varargs structured([Ljava/lang/Object;)Ljava/lang/String;
    .locals 3
    .param p0, "values"    # [Ljava/lang/Object;

    .prologue
    .line 853
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, ";"

    new-instance v2, Lezvcard/io/scribe/VCardPropertyScribe$2;

    invoke-direct {v2}, Lezvcard/io/scribe/VCardPropertyScribe$2;-><init>()V

    invoke-static {v0, v1, v2}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Lezvcard/util/StringUtils$JoinCallback;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static unescape(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 589
    if-nez p0, :cond_1

    .line 590
    const/4 p0, 0x0

    .line 625
    .end local p0    # "text":Ljava/lang/String;
    .local v1, "escaped":Z
    .local v2, "i":I
    .local v3, "sb":Ljava/lang/StringBuilder;
    :cond_0
    :goto_0
    return-object p0

    .line 593
    .end local v1    # "escaped":Z
    .end local v2    # "i":I
    .end local v3    # "sb":Ljava/lang/StringBuilder;
    .restart local p0    # "text":Ljava/lang/String;
    :cond_1
    const/4 v3, 0x0

    .line 594
    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 595
    .restart local v1    # "escaped":Z
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_8

    .line 596
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 598
    .local v0, "ch":C
    if-eqz v1, :cond_6

    .line 599
    if-nez v3, :cond_2

    .line 600
    new-instance v3, Ljava/lang/StringBuilder;

    .end local v3    # "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 601
    .restart local v3    # "sb":Ljava/lang/StringBuilder;
    const/4 v4, 0x0

    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    :cond_2
    const/4 v1, 0x0

    .line 606
    const/16 v4, 0x6e

    if-eq v0, v4, :cond_3

    const/16 v4, 0x4e

    if-ne v0, v4, :cond_5

    .line 608
    :cond_3
    sget-object v4, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 612
    :cond_5
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 616
    :cond_6
    const/16 v4, 0x5c

    if-ne v0, v4, :cond_7

    .line 617
    const/4 v1, 0x1

    .line 618
    goto :goto_2

    .line 621
    :cond_7
    if-eqz v3, :cond_4

    .line 622
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 625
    .end local v0    # "ch":C
    :cond_8
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Lezvcard/VCardDataType;"
        }
    .end annotation

    .prologue
    .line 330
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p2}, Lezvcard/io/scribe/VCardPropertyScribe;->_defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected abstract _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 7
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 486
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 487
    .local v1, "value":Ljava/lang/String;
    new-instance v4, Lezvcard/parameter/VCardParameters;

    invoke-direct {v4}, Lezvcard/parameter/VCardParameters;-><init>()V

    .line 488
    .local v4, "parameters":Lezvcard/parameter/VCardParameters;
    const/4 v2, 0x0

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    move-object v0, p0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v6

    .line 489
    .local v6, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {v6, v4}, Lezvcard/property/VCardProperty;->setParameters(Lezvcard/parameter/VCardParameters;)V

    .line 490
    return-object v6
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 6
    .param p1, "value"    # Lezvcard/io/json/JCardValue;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/json/JCardValue;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 561
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->jcardValueToString(Lezvcard/io/json/JCardValue;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v0

    return-object v0
.end method

.method protected abstract _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 10
    .param p1, "element"    # Lezvcard/io/xml/XCardElement;
    .param p2, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/xml/XCardElement;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 440
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 441
    .local v1, "value":Ljava/lang/String;
    const/4 v2, 0x0

    .line 442
    .local v2, "dataType":Lezvcard/VCardDataType;
    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->element()Lorg/w3c/dom/Element;

    move-result-object v9

    .line 445
    .local v9, "rawElement":Lorg/w3c/dom/Element;
    invoke-interface {v9}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-static {v0}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v7

    .line 446
    .local v7, "children":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .local v8, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/w3c/dom/Element;

    .line 447
    .local v6, "child":Lorg/w3c/dom/Element;
    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->version()Lezvcard/VCardVersion;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    invoke-interface {v6}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lezvcard/VCardDataType;->get(Ljava/lang/String;)Lezvcard/VCardDataType;

    move-result-object v2

    .line 452
    invoke-interface {v6}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v1

    .line 456
    .end local v6    # "child":Lorg/w3c/dom/Element;
    :cond_1
    if-nez v2, :cond_2

    .line 458
    invoke-interface {v9}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v1

    .line 461
    :cond_2
    invoke-static {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 462
    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->version()Lezvcard/VCardVersion;

    move-result-object v3

    move-object v0, p0

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p2, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/parameter/VCardParameters;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 295
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    return-void
.end method

.method protected _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .line 383
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {p0, p1, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    .line 384
    .local v0, "value":Ljava/lang/String;
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    return-object v1
.end method

.method protected abstract _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 3
    .param p2, "element"    # Lezvcard/io/xml/XCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/io/xml/XCardElement;",
            ")V"
        }
    .end annotation

    .prologue
    .line 362
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {p0, p1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v1

    .line 363
    .local v1, "value":Ljava/lang/String;
    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {p0, p1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    .line 364
    .local v0, "dataType":Lezvcard/VCardDataType;
    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 365
    return-void
.end method

.method public final dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Lezvcard/VCardDataType;"
        }
    .end annotation

    .prologue
    .line 162
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;->_dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method public final defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 152
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/VCardPropertyScribe;->_defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method public getPropertyClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 99
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    iget-object v0, p0, Lezvcard/io/scribe/VCardPropertyScribe;->clazz:Ljava/lang/Class;

    return-object v0
.end method

.method public getPropertyName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    iget-object v0, p0, Lezvcard/io/scribe/VCardPropertyScribe;->propertyName:Ljava/lang/String;

    return-object v0
.end method

.method public getQName()Ljavax/xml/namespace/QName;
    .locals 1

    .prologue
    .line 115
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    iget-object v0, p0, Lezvcard/io/scribe/VCardPropertyScribe;->qname:Ljavax/xml/namespace/QName;

    return-object v0
.end method

.method public final parseHtml(Lorg/jsoup/nodes/Element;)Lezvcard/io/scribe/VCardPropertyScribe$Result;
    .locals 4
    .param p1, "element"    # Lorg/jsoup/nodes/Element;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jsoup/nodes/Element;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe$Result",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 254
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    new-instance v0, Lezvcard/io/html/HCardElement;

    invoke-direct {v0, p1}, Lezvcard/io/html/HCardElement;-><init>(Lorg/jsoup/nodes/Element;)V

    .line 255
    .local v0, "hcardElement":Lezvcard/io/html/HCardElement;
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .local v2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, v0, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v1

    .line 257
    .local v1, "property":Lezvcard/property/VCardProperty;, "TT;"
    new-instance v3, Lezvcard/io/scribe/VCardPropertyScribe$Result;

    invoke-direct {v3, v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe$Result;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    return-object v3
.end method

.method public final parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;
    .locals 3
    .param p1, "value"    # Lezvcard/io/json/JCardValue;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/json/JCardValue;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/parameter/VCardParameters;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe$Result",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 272
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 273
    .local v1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, p1, p2, p3, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v0

    .line 274
    .local v0, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {v0, p3}, Lezvcard/property/VCardProperty;->setParameters(Lezvcard/parameter/VCardParameters;)V

    .line 275
    new-instance v2, Lezvcard/io/scribe/VCardPropertyScribe$Result;

    invoke-direct {v2, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe$Result;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    return-object v2
.end method

.method public final parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;
    .locals 7
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/parameter/VCardParameters;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe$Result",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 220
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    new-instance v5, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .local v5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 221
    invoke-virtual/range {v0 .. v5}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v6

    .line 222
    .local v6, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {v6, p4}, Lezvcard/property/VCardProperty;->setParameters(Lezvcard/parameter/VCardParameters;)V

    .line 223
    new-instance v0, Lezvcard/io/scribe/VCardPropertyScribe$Result;

    invoke-direct {v0, v6, v5}, Lezvcard/io/scribe/VCardPropertyScribe$Result;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    return-object v0
.end method

.method public final parseXml(Lorg/w3c/dom/Element;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;
    .locals 3
    .param p1, "element"    # Lorg/w3c/dom/Element;
    .param p2, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Lezvcard/parameter/VCardParameters;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe$Result",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 237
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .local v1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v2, Lezvcard/io/xml/XCardElement;

    invoke-direct {v2, p1}, Lezvcard/io/xml/XCardElement;-><init>(Lorg/w3c/dom/Element;)V

    invoke-virtual {p0, v2, p2, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v0

    .line 239
    .local v0, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {v0, p2}, Lezvcard/property/VCardProperty;->setParameters(Lezvcard/parameter/VCardParameters;)V

    .line 240
    new-instance v2, Lezvcard/io/scribe/VCardPropertyScribe$Result;

    invoke-direct {v2, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe$Result;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    return-object v2
.end method

.method public final prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;Lezvcard/VCard;)Lezvcard/parameter/VCardParameters;
    .locals 2
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")",
            "Lezvcard/parameter/VCardParameters;"
        }
    .end annotation

    .prologue
    .line 129
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    new-instance v0, Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/property/VCardProperty;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameters;-><init>(Lezvcard/parameter/VCardParameters;)V

    .line 130
    .local v0, "copy":Lezvcard/parameter/VCardParameters;
    invoke-virtual {p0, p1, v0, p2, p3}, Lezvcard/io/scribe/VCardPropertyScribe;->_prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    .line 131
    return-object v0
.end method

.method public final writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .line 197
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/VCardPropertyScribe;->_writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method public final writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 174
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;->_writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeXml(Lezvcard/property/VCardProperty;Lorg/w3c/dom/Element;)V
    .locals 1
    .param p2, "element"    # Lorg/w3c/dom/Element;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/w3c/dom/Element;",
            ")V"
        }
    .end annotation

    .prologue
    .line 185
    .local p0, "this":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    new-instance v0, Lezvcard/io/xml/XCardElement;

    invoke-direct {v0, p2}, Lezvcard/io/xml/XCardElement;-><init>(Lorg/w3c/dom/Element;)V

    .line 186
    .local v0, "xCardElement":Lezvcard/io/xml/XCardElement;
    invoke-virtual {p0, p1, v0}, Lezvcard/io/scribe/VCardPropertyScribe;->_writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V

    .line 187
    return-void
.end method
