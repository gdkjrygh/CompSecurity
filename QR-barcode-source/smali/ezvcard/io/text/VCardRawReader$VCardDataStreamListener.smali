.class public interface abstract Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;
.super Ljava/lang/Object;
.source "VCardRawReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/text/VCardRawReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VCardDataStreamListener"
.end annotation


# virtual methods
.method public abstract beginComponent(Ljava/lang/String;)V
.end method

.method public abstract endComponent(Ljava/lang/String;)V
.end method

.method public abstract invalidLine(Ljava/lang/String;)V
.end method

.method public abstract invalidVersion(Ljava/lang/String;)V
.end method

.method public abstract readProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V
.end method

.method public abstract readVersion(Lezvcard/VCardVersion;)V
.end method
