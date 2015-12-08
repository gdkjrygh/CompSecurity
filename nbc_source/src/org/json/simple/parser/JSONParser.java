// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// Referenced classes of package org.json.simple.parser:
//            Yylex, ContainerFactory, ParseException, Yytoken, 
//            ContentHandler

public class JSONParser
{

    public static final int S_END = 6;
    public static final int S_INIT = 0;
    public static final int S_IN_ARRAY = 3;
    public static final int S_IN_ERROR = -1;
    public static final int S_IN_FINISHED_VALUE = 1;
    public static final int S_IN_OBJECT = 2;
    public static final int S_IN_PAIR_VALUE = 5;
    public static final int S_PASSED_PAIR_KEY = 4;
    private LinkedList handlerStatusStack;
    private Yylex lexer;
    private int status;
    private Yytoken token;

    public JSONParser()
    {
        lexer = new Yylex((Reader)null);
        token = null;
        status = 0;
    }

    private List createArrayContainer(ContainerFactory containerfactory)
    {
        if (containerfactory == null)
        {
            containerfactory = new JSONArray();
        } else
        {
            List list = containerfactory.creatArrayContainer();
            containerfactory = list;
            if (list == null)
            {
                return new JSONArray();
            }
        }
        return containerfactory;
    }

    private Map createObjectContainer(ContainerFactory containerfactory)
    {
        if (containerfactory == null)
        {
            containerfactory = new JSONObject();
        } else
        {
            Map map = containerfactory.createObjectContainer();
            containerfactory = map;
            if (map == null)
            {
                return new JSONObject();
            }
        }
        return containerfactory;
    }

    private void nextToken()
        throws ParseException, IOException
    {
        token = lexer.yylex();
        if (token == null)
        {
            token = new Yytoken(-1, null);
        }
    }

    private int peekStatus(LinkedList linkedlist)
    {
        if (linkedlist.size() == 0)
        {
            return -1;
        } else
        {
            return ((Integer)linkedlist.getFirst()).intValue();
        }
    }

    public int getPosition()
    {
        return lexer.getPosition();
    }

    public Object parse(Reader reader)
        throws IOException, ParseException
    {
        return parse(reader, (ContainerFactory)null);
    }

    public Object parse(Reader reader, ContainerFactory containerfactory)
        throws IOException, ParseException
    {
        LinkedList linkedlist;
        reset(reader);
        reader = new LinkedList();
        linkedlist = new LinkedList();
_L72:
        nextToken();
        status;
        JVM INSTR tableswitch -1 4: default 940
    //                   -1 891
    //                   0 96
    //                   1 238
    //                   2 271
    //                   3 666
    //                   4 420;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L14:
        if (status == -1)
        {
            throw new ParseException(getPosition(), 1, token);
        }
          goto _L8
_L3:
        token.type;
        JVM INSTR tableswitch 0 3: default 943
    //                   0 140
    //                   1 174
    //                   2 132
    //                   3 206;
           goto _L9 _L10 _L11 _L9 _L12
_L16:
        if (true) goto _L14; else goto _L13
_L13:
_L18:
        if (true) goto _L16; else goto _L15
_L15:
_L20:
        if (true) goto _L18; else goto _L17
_L17:
_L22:
        if (true) goto _L20; else goto _L19
_L19:
_L24:
        if (true) goto _L22; else goto _L21
_L21:
_L26:
        if (true) goto _L24; else goto _L23
_L23:
_L28:
        if (true) goto _L26; else goto _L25
_L25:
_L30:
        if (true) goto _L28; else goto _L27
_L27:
_L32:
        if (true) goto _L30; else goto _L29
_L29:
_L34:
        if (true) goto _L32; else goto _L31
_L31:
_L36:
        if (true) goto _L34; else goto _L33
_L33:
_L38:
        if (true) goto _L36; else goto _L35
_L35:
_L40:
        if (true) goto _L38; else goto _L37
_L37:
_L42:
        if (true) goto _L40; else goto _L39
_L39:
_L44:
        if (true) goto _L42; else goto _L41
_L41:
_L46:
        if (true) goto _L44; else goto _L43
_L43:
_L48:
        if (true) goto _L46; else goto _L45
_L45:
_L50:
        if (true) goto _L48; else goto _L47
_L47:
_L1:
        if (true) goto _L50; else goto _L49
_L49:
_L9:
        status = -1;
          goto _L14
_L10:
        try
        {
            status = 1;
            reader.addFirst(new Integer(status));
            linkedlist.addFirst(token.value);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw reader;
        }
          goto _L14
_L11:
        status = 2;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(createObjectContainer(containerfactory));
          goto _L14
_L12:
        status = 3;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(createArrayContainer(containerfactory));
          goto _L14
_L4:
        if (token.type == -1)
        {
            return linkedlist.removeFirst();
        } else
        {
            throw new ParseException(getPosition(), 1, token);
        }
_L5:
        token.type;
        JVM INSTR tableswitch 0 5: default 946
    //                   0 324
    //                   1 316
    //                   2 382
    //                   3 316
    //                   4 316
    //                   5 68;
           goto _L51 _L52 _L51 _L53 _L51 _L51 _L54
_L51:
        status = -1;
          goto _L54
_L52:
        if (!(token.value instanceof String)) goto _L56; else goto _L55
_L55:
        linkedlist.addFirst((String)token.value);
        status = 4;
        reader.addFirst(new Integer(status));
          goto _L54
_L56:
        status = -1;
          goto _L54
_L53:
        if (linkedlist.size() <= 1) goto _L58; else goto _L57
_L57:
        reader.removeFirst();
        linkedlist.removeFirst();
        status = peekStatus(reader);
          goto _L54
_L58:
        status = 1;
          goto _L54
_L7:
        token.type;
        JVM INSTR tableswitch 0 6: default 949
    //                   0 476
    //                   1 595
    //                   2 468
    //                   3 524
    //                   4 468
    //                   5 468
    //                   6 68;
           goto _L59 _L60 _L61 _L59 _L62 _L59 _L59 _L54
_L54:
        if (true) goto _L14; else goto _L63
_L63:
_L59:
        status = -1;
          goto _L14
_L60:
        reader.removeFirst();
        String s = (String)linkedlist.removeFirst();
        ((Map)linkedlist.getFirst()).put(s, token.value);
        status = peekStatus(reader);
          goto _L14
_L62:
        reader.removeFirst();
        String s1 = (String)linkedlist.removeFirst();
        Map map = (Map)linkedlist.getFirst();
        List list3 = createArrayContainer(containerfactory);
        map.put(s1, list3);
        status = 3;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(list3);
          goto _L14
_L61:
        reader.removeFirst();
        String s2 = (String)linkedlist.removeFirst();
        Map map1 = (Map)linkedlist.getFirst();
        Map map3 = createObjectContainer(containerfactory);
        map1.put(s2, map3);
        status = 2;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(map3);
          goto _L14
_L6:
        token.type;
        JVM INSTR tableswitch 0 5: default 952
    //                   0 720
    //                   1 781
    //                   2 712
    //                   3 836
    //                   4 743
    //                   5 68;
           goto _L64 _L65 _L66 _L64 _L67 _L68 _L14
_L64:
        status = -1;
          goto _L14
_L65:
        ((List)linkedlist.getFirst()).add(token.value);
          goto _L14
_L68:
        if (linkedlist.size() <= 1) goto _L70; else goto _L69
_L69:
        reader.removeFirst();
        linkedlist.removeFirst();
        status = peekStatus(reader);
          goto _L14
_L70:
        status = 1;
          goto _L14
_L66:
        List list = (List)linkedlist.getFirst();
        Map map2 = createObjectContainer(containerfactory);
        list.add(map2);
        status = 2;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(map2);
          goto _L14
_L67:
        List list1 = (List)linkedlist.getFirst();
        List list2 = createArrayContainer(containerfactory);
        list1.add(list2);
        status = 3;
        reader.addFirst(new Integer(status));
        linkedlist.addFirst(list2);
          goto _L14
_L2:
        throw new ParseException(getPosition(), 1, token);
_L8:
        int i = token.type;
        if (i == -1)
        {
            throw new ParseException(getPosition(), 1, token);
        }
        if (true) goto _L72; else goto _L71
_L71:
    }

    public Object parse(String s)
        throws ParseException
    {
        return parse(s, (ContainerFactory)null);
    }

    public Object parse(String s, ContainerFactory containerfactory)
        throws ParseException
    {
        s = new StringReader(s);
        try
        {
            s = ((String) (parse(((Reader) (s)), containerfactory)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ParseException(-1, 2, s);
        }
        return s;
    }

    public void parse(Reader reader, ContentHandler contenthandler)
        throws IOException, ParseException
    {
        parse(reader, contenthandler, false);
    }

    public void parse(Reader reader, ContentHandler contenthandler, boolean flag)
        throws IOException, ParseException
    {
        if (flag) goto _L2; else goto _L1
_L1:
        reset(reader);
        handlerStatusStack = new LinkedList();
_L53:
        reader = handlerStatusStack;
_L51:
        status;
        JVM INSTR tableswitch -1 6: default 975
    //                   -1 921
    //                   0 135
    //                   1 297
    //                   2 363
    //                   3 746
    //                   4 525
    //                   5 722
    //                   6 981;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        if (status == -1)
        {
            throw new ParseException(getPosition(), 1, token);
        }
          goto _L12
_L2:
        if (handlerStatusStack == null)
        {
            reset(reader);
            handlerStatusStack = new LinkedList();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        contenthandler.startJSON();
        nextToken();
        token.type;
        JVM INSTR tableswitch 0 3: default 978
    //                   0 200
    //                   1 237
    //                   2 184
    //                   3 267;
           goto _L13 _L14 _L15 _L13 _L16
_L13:
        status = -1;
          goto _L3
_L14:
        status = 1;
        reader.addFirst(new Integer(status));
        if (contenthandler.primitive(token.value)) goto _L3; else goto _L17
_L17:
        return;
_L15:
        status = 2;
        reader.addFirst(new Integer(status));
        if (contenthandler.startObject()) goto _L3; else goto _L18
_L18:
        return;
_L16:
        status = 3;
        reader.addFirst(new Integer(status));
        if (contenthandler.startArray()) goto _L3; else goto _L19
_L19:
        return;
_L6:
        nextToken();
        if (token.type == -1)
        {
            contenthandler.endJSON();
            status = 6;
            return;
        }
        try
        {
            status = -1;
            throw new ParseException(getPosition(), 1, token);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            status = -1;
            throw reader;
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            status = -1;
            throw reader;
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            status = -1;
            throw reader;
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            status = -1;
        }
        throw reader;
_L7:
        nextToken();
        token.type;
        JVM INSTR tableswitch 0 5: default 982
    //                   0 420
    //                   1 412
    //                   2 485
    //                   3 412
    //                   4 412
    //                   5 76;
           goto _L20 _L21 _L20 _L22 _L20 _L20 _L3
_L20:
        status = -1;
          goto _L3
_L21:
        if (!(token.value instanceof String)) goto _L24; else goto _L23
_L23:
        String s;
        s = (String)token.value;
        status = 4;
        reader.addFirst(new Integer(status));
        if (contenthandler.startObjectEntry(s)) goto _L3; else goto _L25
_L25:
        return;
_L24:
        status = -1;
          goto _L3
_L22:
        if (reader.size() <= 1) goto _L27; else goto _L26
_L26:
        reader.removeFirst();
        status = peekStatus(reader);
_L29:
        if (contenthandler.endObject()) goto _L3; else goto _L28
_L28:
        return;
_L27:
        status = 1;
          goto _L29
_L9:
        nextToken();
        token.type;
        JVM INSTR tableswitch 0 6: default 985
    //                   0 588
    //                   1 675
    //                   2 580
    //                   3 628
    //                   4 580
    //                   5 580
    //                   6 76;
           goto _L30 _L31 _L32 _L30 _L33 _L30 _L30 _L3
_L30:
        status = -1;
          goto _L3
_L31:
        reader.removeFirst();
        status = peekStatus(reader);
        if (contenthandler.primitive(token.value) && contenthandler.endObjectEntry()) goto _L3; else goto _L34
_L34:
        return;
_L33:
        reader.removeFirst();
        reader.addFirst(new Integer(5));
        status = 3;
        reader.addFirst(new Integer(status));
        if (contenthandler.startArray()) goto _L3; else goto _L35
_L35:
        return;
_L32:
        reader.removeFirst();
        reader.addFirst(new Integer(5));
        status = 2;
        reader.addFirst(new Integer(status));
        if (contenthandler.startObject()) goto _L3; else goto _L36
_L36:
        return;
_L10:
        reader.removeFirst();
        status = peekStatus(reader);
        if (contenthandler.endObjectEntry()) goto _L3; else goto _L37
_L37:
        return;
_L8:
        nextToken();
        token.type;
        JVM INSTR tableswitch 0 5: default 988
    //                   0 804
    //                   1 861
    //                   2 796
    //                   3 891
    //                   4 821
    //                   5 76;
           goto _L38 _L39 _L40 _L38 _L41 _L42 _L3
_L38:
        status = -1;
          goto _L3
_L39:
        if (contenthandler.primitive(token.value)) goto _L3; else goto _L43
_L43:
        return;
_L42:
        if (reader.size() <= 1) goto _L45; else goto _L44
_L44:
        reader.removeFirst();
        status = peekStatus(reader);
_L47:
        if (contenthandler.endArray()) goto _L3; else goto _L46
_L46:
        return;
_L45:
        status = 1;
          goto _L47
_L40:
        status = 2;
        reader.addFirst(new Integer(status));
        if (contenthandler.startObject()) goto _L3; else goto _L48
_L48:
        return;
_L41:
        status = 3;
        reader.addFirst(new Integer(status));
        if (contenthandler.startArray()) goto _L3; else goto _L49
_L49:
        return;
_L4:
        throw new ParseException(getPosition(), 1, token);
_L12:
        int i = token.type;
        if (i != -1) goto _L51; else goto _L50
_L50:
        status = -1;
        throw new ParseException(getPosition(), 1, token);
_L11:
        return;
        if (true) goto _L53; else goto _L52
_L52:
    }

    public void parse(String s, ContentHandler contenthandler)
        throws ParseException
    {
        parse(s, contenthandler, false);
    }

    public void parse(String s, ContentHandler contenthandler, boolean flag)
        throws ParseException
    {
        s = new StringReader(s);
        try
        {
            parse(((Reader) (s)), contenthandler, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ParseException(-1, 2, s);
        }
    }

    public void reset()
    {
        token = null;
        status = 0;
        handlerStatusStack = null;
    }

    public void reset(Reader reader)
    {
        lexer.yyreset(reader);
        reset();
    }
}
